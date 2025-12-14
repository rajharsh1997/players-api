package com.example.players_api;

//static example
public class Dog {
    String name;
    int age;
    int livesRemaining;

    private static int dogCount = 0;

    public void Bark() {
        System.out.println("Bark");
    }

    // We increment in our constructor to keep track of no. of dog objects that have
    // been created
    public Dog() {
        dogCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // All of above fields and methods are non-static except dogCount.'static'
    // keyword is not there.
    // Implies that all of above fields and method apply to objects/instance of this
    // class
    // and not to class itself

    public static int getDogCount() {
        return dogCount;
    }
}
