package com.nhnent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

@Controller
public class MainController {
    @RequestMapping("/")
    public String hello(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "Hello, world");
        return "welcome";
    }
}
