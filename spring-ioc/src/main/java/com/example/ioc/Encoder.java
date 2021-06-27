package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

public class Encoder {
    private IEncoder iEncoder;

    //DI
    //외부에서 주입을 받아서 사용 DI

    //4.
    //@Component component가 여러개여서 qualifier를 붙어서 지정해주지 않으면 오류 발생 --> 여러개를 한번에 등록하고 싶을땐? @Configuration
    /*public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }*/

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder ;
    }

    public String encode(String message) throws UnsupportedEncodingException {
        return  iEncoder.encode(message);
    }
}

