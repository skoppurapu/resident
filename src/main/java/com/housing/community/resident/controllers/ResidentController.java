package com.housing.community.resident.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResidentController {

    @GetMapping("/residents")
    public String getResidentList() {
        return "List of residents";
    }
}
