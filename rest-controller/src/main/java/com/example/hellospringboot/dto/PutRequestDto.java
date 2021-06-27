package com.example.hellospringboot.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class) //해당 클래스에 모든 제이슨 네이밍 규칙을 적용시켜줄 수 있다.
public class PutRequestDto {

    /*
      {
            "name" : "m",
            "age" : 30,
            "car_list" : [
                {"name" : "가", "car_number" : "123", "car_type" : "1"},
                {"name" : "나", "car_number" : "456", "car_type" : "2"},
                {"name" : "다", "car_number" : "879", "car_type" : "3"}
            ]
      }
     */
    private String name;
    private int age;
    private List<CarDto> carList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<CarDto> getCarList() {
        return carList;
    }

    public void setCarList(List<CarDto> carDto) {
        this.carList = carDto;
    }

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carDto=" + carList +
                '}';
    }
}
