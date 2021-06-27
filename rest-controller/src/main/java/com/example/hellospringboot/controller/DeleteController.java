package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete")
public class DeleteController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable(value = "userId") Long id, @RequestParam String account) {
        System.out.println(id);
        System.out.println(account);

        //delete => 리소스의 삭제
        //이미 리소스가 없을때도 200 리턴 (역동성)
        //delete는 요청하는 값이 제한적이고 작기 때문에 dto보다 pathvariable 지정해서 받는 형식을 선호한다.
    }
}
