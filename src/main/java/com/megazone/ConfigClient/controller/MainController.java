package com.megazone.ConfigClient.controller;

import com.megazone.ConfigClient.config.CustomConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private CustomConfig customConfig;

    @GetMapping("/profile")
    public String getProfile() {
        return "profile: " + customConfig.getProfile();
    }

    @GetMapping("/password")
    public String getPassword() {
        return "password: " + customConfig.getPassword();
    }
}