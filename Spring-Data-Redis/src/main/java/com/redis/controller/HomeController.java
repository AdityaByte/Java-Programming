package com.redis.controller;

import com.redis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String homeHandler(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
}
