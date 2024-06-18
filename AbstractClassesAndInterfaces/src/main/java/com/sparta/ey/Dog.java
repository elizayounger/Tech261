package com.sparta.ey;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name; // points to the current object in question
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // int age = 5. type, name, value
        Dog max = new Dog("Max", "Terrier", 2);
        Dog fido = new Dog("Fido", "Terrier", 10);
        System.out.println(max.getName());
    }
}

