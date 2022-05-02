package com.example.sboot.Interview;

public class Fruit {
    private int age;
    public Fruit(){}
    public Fruit(int age){
        this.age = age;
    }

    protected int validity;
    protected boolean isValid(){
        return this.validity > 2;
    }
}
