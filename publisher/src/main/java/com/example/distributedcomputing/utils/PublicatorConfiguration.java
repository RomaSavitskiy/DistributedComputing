package com.example.distributedcomputing.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class PublicatorConfiguration {
    @Bean
    public RestClient restTemplate() {
        return RestClient.create();
    }
}
