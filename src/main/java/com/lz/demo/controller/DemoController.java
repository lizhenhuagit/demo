package com.lz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("demo")

@RestController
public class DemoController {
    @GetMapping("hello")
    public String ss(){
        return "早上好啊，臻臻!";
    }
}
