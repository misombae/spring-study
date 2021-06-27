package com.company.design.ioc;

import java.io.UnsupportedEncodingException;

public class Encoder {
    private IEncoder iEncoder;

    //3.방법
    public Encoder() {
        //this.iEncoder = new Base64Encoder();
        this.iEncoder = new UrlEncoder();
    }

    //DI
    //외부에서 주입을 받아서 사용 DI
    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) throws UnsupportedEncodingException {
        return  iEncoder.encode(message);
    }
}
