package com.supabase.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.supabase.dto.UserRequest;
import com.supabase.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/supa")
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String addUser(@RequestBody UserRequest userRequest) {
        userService.addUser(userRequest);
        return "User has been created";
    }

    @PostMapping("/file")
    public ResponseEntity<String> uploadFile(@RequestPart("file")MultipartFile file) {
        try {
            boolean result = userService.uploadFile(file);
            if (result) {
                return ResponseEntity.ok("File uploaded successfully");
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Failed to upload the file");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/file")
    public ResponseEntity<?> downloadFile(@RequestParam("filename") String filename) {
        try {
            return userService.downloadFile(filename);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }
}
