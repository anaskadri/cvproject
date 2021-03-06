package com.example.cvproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CvprojectApplication {

    @GetMapping("/welcome")
    public String welcome(){
        System.out.println("hellos");
        return "whatsapp";
    }

    public static void main(String[] args) {
        SpringApplication.run(CvprojectApplication.class, args);
    }

}
