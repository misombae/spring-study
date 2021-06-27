package com.example.hellospringboot.controller;

import com.example.hellospringboot.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/response")
public class ResponseController {

    //응답을 내려주는 방법들
    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //JSON
    //req --> object mapper -> object -> method-> object -> object mapper -> json ->response
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto user) {
        return user;
    }

    //응답 커스터마이징 ResponseEntity
    //명확하게 값을 만들어서 내릴 수 있다.
    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto user) {
        return  ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
