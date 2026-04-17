package com.demo.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String email) {
        return "Login successful for " + email;
    }

    @GetMapping("/profile")
    public String profile() {
        return "User profile data";
    }
}
