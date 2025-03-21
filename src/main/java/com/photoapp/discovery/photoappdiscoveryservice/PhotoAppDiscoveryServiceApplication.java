package com.photoapp.discovery.photoappdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
    }

}
