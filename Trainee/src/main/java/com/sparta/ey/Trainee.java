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
    private String experience;
    private String[] projects;
    private String[] certifications;

    public Trainee(String name, int age, String email, String phone, String experience, String[] projects, String[] certifications) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.experience = experience;
        this.projects = projects;
        this.certifications = certifications;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }


}
