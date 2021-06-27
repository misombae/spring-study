package com.example.hellospringboot.controller;

import com.example.hellospringboot.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    //@Controller 어노테이션은 String을 리턴하는 경우 html.. 리소스를 찾음
    @RequestMapping("/main")
    public String main() {
        return  "main.html";
    }

    /*
     아래방법을 사용하기 보다 @Controller에서는 @ResponseBody를 안내리고 api에대해서는 apicontroller를 만들어서 @RestController annotation을 사용하는 것이 정확하다.
     */
    @ResponseBody //@Controller에서 ResponseBody를 붙여주면 리소스를 찾지 않고 객체를 넘겨준다.
    @GetMapping("/user")
    public UserDto user() {
        var user = new UserDto();
        user.setName("이름");
        user.setAddress("주소");
        return user;
    }
}
