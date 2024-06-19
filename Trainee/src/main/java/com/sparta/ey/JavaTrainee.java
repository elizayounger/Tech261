package com.sparta.ey;
//Create a subclass called JavaTrainee that extends Trainee and has the following fields:
//experience
//certifications
//projects
//gitHub

public class JavaTrainee extends Trainee {
    private String javaTrainee;
    private String experience;
    private String projects;
    private String github;

    public JavaTrainee(String name, int age, String email, String phone, String javaTrainee, String experience, String projects, String github) {
        super(name, age, email, phone);
        this.javaTrainee = javaTrainee;
        this.experience = experience;
        this.projects = projects;
        this.github = github;
    }


}
