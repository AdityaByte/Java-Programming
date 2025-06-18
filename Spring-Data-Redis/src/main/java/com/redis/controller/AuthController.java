package com.redis.controller;

import com.redis.dto.OTP;
import com.redis.model.User;
import com.redis.service.RedisUserService;
import com.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private RedisUserService redisUserService;

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signupHandler(@ModelAttribute("user") User user, Model model) {
        System.out.println(user.toString());
        // Here we have to check the fields ok on the basis of that we need to show the page to the user.
        if (user != null) {
            String username = user.getUsername();
            String password = user.getPassword();
            if (username == null || password == null) {
                System.out.println("Invalid username and password");
                return "index";
            } else if (username.trim().isEmpty() || password.trim().isEmpty()) {
                System.out.println("Invalid username and password");
                return "index";
            }
            // Else we have to save the user temporary in the redis db.
            // Saving the User.
            redisUserService.saveUser(user);
            OTP otp = new OTP();
            otp.setTargetIdentifier(username);
            model.addAttribute("otp", otp);
            return "otp";
        }
        return "index";
    }

    @ResponseBody
    @PostMapping("/submit-otp")
    public String otpHandler(@ModelAttribute("otp") OTP otp) {
        System.out.println(otp.toString());
        if (otp != null && otp.getOtp().equals("2004")) {
            User user = redisUserService.getUser(otp.getTargetIdentifier());
            if (user == null) {
                return "No user found of the target identifier";
            }
            // Here we need to save the user at the database.
            userService.saveUser(user);
            redisUserService.removeUser(user.getUsername());
            return "User Created.";
        }
        return "Failed | OTP is null";
    }


}
