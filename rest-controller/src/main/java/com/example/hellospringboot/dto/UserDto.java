package com.example.hellospringboot.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) //null값 포함하지 않을때
public class UserDto {

    private String name;
    private int age; //default값 0 , default값을 null로 하고 싶으면 Integer
    @JsonProperty("phone_number")
    private String poneNumber;
    private String address;

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

    public String getPoneNumber() {
        return poneNumber;
    }

    public void setPoneNumber(String poneNumber) {
        this.poneNumber = poneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poneNumber='" + poneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
