package com.example.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SourceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SourceApplication.class, args);
    }

}
// postman 과 http로 쏠 때 ip가 다름
// docker registry (도커 이미지 따로 보관)
