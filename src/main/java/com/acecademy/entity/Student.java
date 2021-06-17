package com.acecademy.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {

    private int id;
    private String name;
    private String city;
}
