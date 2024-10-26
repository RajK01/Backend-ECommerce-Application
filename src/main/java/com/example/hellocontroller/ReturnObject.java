package com.example.hellocontroller;

// Model class to represent a return object
public class ReturnObject {
    private String name;
    private int age;

    // Constructor
    public ReturnObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
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
}
