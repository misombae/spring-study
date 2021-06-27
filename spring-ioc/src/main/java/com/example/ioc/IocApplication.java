package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) throws UnsupportedEncodingException {
        SpringApplication.run(IocApplication.class, args);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
        String result = "";
        ApplicationContext context = ApplicationContextProvider.getContext();
       // Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
       // UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

        //4. Encoder.class에 Qualifier로 설정
        /* Encoder encoder = context.getBean(Encoder.class);
        result = encoder.encode(url);
        System.out.println(result);
        */

        //5.
        Encoder encoder1 = context.getBean("base64Encode", Encoder.class);
        result = encoder1.encode(url);
        System.out.println(result);
        encoder1 = context.getBean("urlEncode", Encoder.class);
        result =encoder1.encode(url);
        System.out.println(result);
    }
}


//5.
@Configuration //한class에서 여러개의 bean을 생성할때 사용
class Appconfig {

    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder) {
        return  new Encoder(urlEncoder);
    }

}