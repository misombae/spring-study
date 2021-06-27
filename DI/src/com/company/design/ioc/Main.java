package com.company.design.ioc;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        //1. 모두 객체를 만들어서 사용
        //Base 64 Encode
        Base64Encoder encoder = new Base64Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        //URL Encode
        UrlEncoder urlEncoder = new UrlEncoder();
        result = urlEncoder.encode(url);
        System.out.println(result);


        //2. 인터페이스로 개발
        IEncoder encoder1 = new Base64Encoder();
        result = encoder1.encode(url);
        System.out.println(result);

        IEncoder encoder2 = new UrlEncoder();
        result = encoder2.encode(url);
        System.out.println(result);


        //3. Encoder class생성
        Encoder encode = new Encoder();
        result = encode.encode(url); //base64인지 url인지는 Encoder에서 수정 --> 테스트 어려움
        System.out.println(result);

        //4. DI사
        //base64에서 urlencoder로 변경하고 자 하는 경우 :  Encoder class 변경시킬 필요 없고, 객체를 변경 시킬 필요 없음
        Encoder diencode = new Encoder(new Base64Encoder()); //넘겨주는 주입 객체만 바꿔준다. 객체를 직접 주입시켜주고 있음 ioc는 스프링 컨테이너가 관리함 (spring-ioc프로젝트 참고)
        result = diencode.encode(url);
        System.out.println(result);

    }
}
