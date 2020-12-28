package com.lz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("v1.0")
@RestController
public class DemoController {
    @GetMapping("hello")
    public String ss(){
        return "hello new branches!";
    }
}
