package com.nhnent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }
}
