package com.sparta.mg.factory;

public class AnimalFactory {

    //Gives access to objects but hides how they are created
    public static Speakable getAnimal(String animal) {
        return switch (animal) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Goldfish" -> new Goldfish();
            default -> null;
        };
    }
}
