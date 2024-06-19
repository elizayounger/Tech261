package com.sparta.ey;
//Create a subclass called JavaTrainee that extends Trainee and has the following fields:
//experience
//certifications
//projects
//gitHub

public class JavaTrainee extends Trainee implements Trainable {
    private String github;

    public JavaTrainee(String name, int age, String email, String phone, String experience, String[] projects, String[] certifications, String github) {
        super(name, age, email, phone, experience, projects, certifications);
        this.github = github;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void train() {
        System.out.println("Implementation of train in JavaTrainee Class");
    }
    public void study() {
        System.out.println("Implementation of study in JavaTrainee Class");
    }
}
