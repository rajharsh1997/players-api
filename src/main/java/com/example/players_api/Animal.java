package com.example.players_api;

public abstract class Animal {
    String name;
    int age;

    // Interface cannot have constructor
    // Can have constructor in abstract class.
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // No BODY is needed for abstract method and create implementation in child
    // method is required
    public abstract void makeNoise();

    // Normal methods can also be present
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
