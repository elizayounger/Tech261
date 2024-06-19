package com.sparta.ey;
//Create a subclass called DevOpsTrainee that extends Trainee and has the following fields:
//experience
//certifications
//projects

public class DevOpsTrainee extends Trainee implements Trainable {
    public DevOpsTrainee(String name, int age, String email, String phone, String experience, String[] projects, String[] certifications) {
        super(name, age, email, phone, experience, projects, certifications);
    }

    @Override
    public void train() {
        System.out.println("Implementation of train in DevOpsTrainee Class");
    }
    @Override
    public void study() {
        System.out.println("Implementation of study in DevOpsTrainee Class");
    }
}
