package com.megazone.ConfigClient.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class CustomConfig {

    @Getter
    @Value("${profile}")
    private String profile;

    @Getter
    @Value("${test}")
    private String password;

}