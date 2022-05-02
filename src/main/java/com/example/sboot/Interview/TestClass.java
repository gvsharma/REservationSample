package com.example.sboot.Interview;

import java.io.Serializable;

public class TestClass {
    private static TestClass mInstance = new TestClass();
    public synchronized TestClass getInstance(){
        if(mInstance == null){
            synchronized (TestClass.class) {
                mInstance = new TestClass();
            }
        }
        return mInstance;
    }
}


