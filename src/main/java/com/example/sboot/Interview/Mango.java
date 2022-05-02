package com.example.sboot.Interview;

public class Mango extends Fruit {

    public Mango(){}
    public Mango(int validity){
        this.validity = validity;
    }

    @Override
    protected boolean isValid() {
        return validity > 5;
    }
}
