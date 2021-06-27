package com.example.hellospringboot.controller;

import com.example.hellospringboot.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/put")
public class PutController {

    @PutMapping ("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putDto, @PathVariable(value = "userId") Long id) {
        System.out.println(putDto);
        return putDto; //object 리턴 시키면 object mapper를 통해서 json으로 자동으로 바꿔서 response body에 보내준다.
    }

}
