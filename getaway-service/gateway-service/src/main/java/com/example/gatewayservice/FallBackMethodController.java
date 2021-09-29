package com.example.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service taking more time then Expected." +
                "Try again later.";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department service taking more time then Expected." +
                "Try again later.";
    }
}
