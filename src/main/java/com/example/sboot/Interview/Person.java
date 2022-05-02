package com.example.sboot.Interview;

import java.io.Serializable;

//what is wrong in below code with serialization
public class Person implements Serializable {
    private String id;
    public String name;
    private String gender;
    private static int age;
}
