package com.example.DemoProject.Model;

public class Boss {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


    // Creating an empty constructor
    public Boss() {}

    // Creating a parameterised constructor
    public Boss(int id, String name, int age) {
        super(); // Super because there's 1> constructor
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
