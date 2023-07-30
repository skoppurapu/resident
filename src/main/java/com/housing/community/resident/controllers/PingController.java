package com.housing.community.resident.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class PingController {

    @Value( "${app.name}" )
    private String appName;

    @GetMapping("/ping")
    public String ping() {
        return appName + " app started successfully.";
    }
}