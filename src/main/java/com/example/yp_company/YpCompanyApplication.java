package com.example.yp_company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YpCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YpCompanyApplication.class, args);
    }

}
