package com.example.AWSSDK;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

    @Bean
    public AmazonS3 s3Client() {
        Regions region = Regions.AP_SOUTH_1;
        return AmazonS3ClientBuilder.standard().withRegion(region).build();
    }

    @Bean
    public AmazonSimpleEmailService emailClient() {
        Regions region = Regions.AP_SOUTH_1;
        return AmazonSimpleEmailServiceClientBuilder.standard().withRegion(region).build();
    }
}