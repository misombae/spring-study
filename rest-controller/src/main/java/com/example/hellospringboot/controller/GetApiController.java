package com.example.hellospringboot.controller;

import com.example.hellospringboot.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hello get Mapping";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi () {
        return "이전에 사용하던 매핑방법";
    }

    //Path Variable
    @RequestMapping("/path-variable/{path-name}")
    public String pathVariable(@PathVariable(name = "path-name") String name) {
        System.out.println("path:" + name);
        return name;
    }

    //Query Prameter(매개변수인자)
    //http://localhost:8080/api/get/query-param?user=ms&email=ms@naver.com&age=30
    //어떤 객체가 들어올지 모르는 경우?
    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach( entry -> {
            sb.append(entry.getKey() + " = "  + entry.getValue() + "\n");
        });

        System.out.println(sb.toString());
        return sb.toString();
    }

    //http://localhost:8080/api/get/query-param?user=ms&email=ms@naver.com&age=30
    //들어오는 객체가 몇개 없을 경우, 변경되지 않을 경우 사용할 수 있음
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        return name +","+email+","+age;
    }

    //http://localhost:8080/api/get/query-param?user=ms&email=ms@naver.com&age=30
    //가장 많이 사용하는 방법, 객체를 미리 정의, 정의되지 않은 객체가 들어오는 경우 매핑되지 않는다.
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) { //dto는 @RequstParm을 붙이지 않는다. = 객체가 들어오면 해당 객체에서 변수와 이름을 매칭하게 된다.
        System.out.println(userRequest.getName() +","+userRequest.getEmail()+","+userRequest.getAge());
        return userRequest.toString();
    }
}
