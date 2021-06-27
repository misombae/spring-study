package com.example.hellospringboot.controller;

import com.example.hellospringboot.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping ("/api/post")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, String> requestData) { //post는 body의 데이터를 가져오기 때문에 @RequestBody
        requestData.forEach((key, value) -> {
            System.out.println(key + " : "  + value);
        });
    }

    @PostMapping("/post01")
    public void post01(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto.toString());
    }
}
