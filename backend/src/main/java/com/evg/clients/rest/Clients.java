package com.evg.clients.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clients {
    @GetMapping("/info")
    public String getInfo() {
        return "This is a Clients Microservice";
    }
}
