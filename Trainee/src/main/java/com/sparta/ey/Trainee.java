package com.sparta.ey;

//Create an interface called Trainable with the following methods:
//train()
//study()

//Make the JavaTrainee and DevOpsTrainee classes implement the Trainable interface.

//Create an abstract class called Trainee with the following fields: name, age, email, phone
public abstract class Trainee {
    private String name;
    private int age;
    private String email;
    private String phone;

    public Trainee(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }


}
