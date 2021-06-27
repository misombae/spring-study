package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 class는 REST API를 처리하는 controller
@RequestMapping("/api") //URI를 지정해주는 어노테이션
public class ApiController {

    @GetMapping("/hello") //GET방식으로 API열기
    public String hello() { //http://localhost:9090/qpi/hello
        return "hello spring boot!";
    }




}
