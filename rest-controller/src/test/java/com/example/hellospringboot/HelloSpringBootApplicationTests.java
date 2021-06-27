package com.example.hellospringboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello tests");

        /*
            Object Mapper
            Text JSON -> Object
            Object -> Text JSON

            controller req json(text) -> object
            response object -> json(text)

         */

        var objectMapper = new ObjectMapper();
        //object->text
        //object에서 text로 변환할때는 object mapper 가 get method를 활용한다.
        var user = new User("m", 20);
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text); //결과 : {"name":"m","age":20}

        //text->object
        //object mapper가 default 생성자를 활용한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser); //결과:User{name='m', age=20}

    }

}
