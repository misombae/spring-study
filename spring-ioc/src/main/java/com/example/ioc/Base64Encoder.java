package com.example.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component   //해당 class를 spring bean으로 spring에서 관리하라는 어노테이션
//spring이 실행될때 어노테이션이 붙어있는 클래스들을 찾아서 직접 객체를 받아서 싱글톤 형태로 만들어서 스프링컨테이너에서 관리하게 된다.
public class Base64Encoder implements IEncoder {
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
