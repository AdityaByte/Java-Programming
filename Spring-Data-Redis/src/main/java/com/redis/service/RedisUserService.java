package com.redis.service;

import com.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisUserService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveUser(User user) {
        redisTemplate.opsForValue().set("user:"+user.getUsername(), user);
    }

    public User getUser(String username) {
        return (User) redisTemplate.opsForValue().get("user:"+username);
    }

    public boolean removeUser(String key) {
        return redisTemplate.delete("user:"+key);
    }

}
