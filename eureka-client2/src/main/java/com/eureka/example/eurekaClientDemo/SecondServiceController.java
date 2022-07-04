package com.eureka.example.eurekaClientDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {
    @GetMapping("/product")
    public String getFood() {
        return "컴퓨터";
    }
}
