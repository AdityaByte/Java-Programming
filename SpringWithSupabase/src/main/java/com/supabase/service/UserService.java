package com.supabase.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.supabase.dto.SignedUrlResponse;
import com.supabase.dto.UserRequest;
import com.supabase.model.User;
import com.supabase.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    @Value("${supabase.api.url}")
    private String API_URL;
    @Value("${supabase.api.servicekey}")
    private String API_KEY;
    private final RestTemplate restTemplate;
    private String BUCKET_NAME = "test";
    private final ObjectMapper objectMapper;


    public void addUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        userRepository.save(user);
    }

    public boolean uploadFile(MultipartFile file) throws IOException {
        // Creating a Post request along with the bearer token and entity that we wants to store.
        String uploadUrl = API_URL + "/storage/v1/object/" + BUCKET_NAME + "/" + file.getOriginalFilename();

        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", API_KEY);
        headers.set("Authorization", "Bearer " + API_KEY);
        headers.setContentType(MediaType.parseMediaType(file.getContentType()));

        HttpEntity<byte[]> entity = new HttpEntity<>(file.getBytes(), headers);

        ResponseEntity<String> response = restTemplate.exchange(uploadUrl, HttpMethod.POST, entity, String.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return true;
        }
        return false;
    }

    public ResponseEntity<?> downloadFile(String filename) throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + API_KEY);
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Integer> map = Map.of("expiresIn", 3600);

        HttpEntity<Map<String, Integer>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                API_URL + "/storage/v1/object/sign/" + BUCKET_NAME + "/" + filename,
                HttpMethod.POST,
                request,
                String.class
        );

        if (!response.getStatusCode().is2xxSuccessful()) {
            System.out.println(response.getBody());
            return response;
        }

        SignedUrlResponse newResponse = objectMapper.readValue(response.getBody(), SignedUrlResponse.class);
        return ResponseEntity
                .ok(API_URL + "/storage/v1" +  newResponse.getSignedURL());
    }
}
