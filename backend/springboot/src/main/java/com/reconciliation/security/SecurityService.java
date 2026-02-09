package com.reconciliation.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityService {

    public static void main(String[] args) {
        SpringApplication.run(SecurityService.class, args);
    }

    @GetMapping("/validate")
    public String validate() {
        // Implement JWT validation logic here
        return "Valid JWT";
    }
}