package com.sparta.mg.animals;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("Max", "Terrier", 10);
        Animal cat = new Cat("Bob", "Cat", 12);

        Animal[] animals = {dog, cat};

        cat.play();
        dog.play();
        ((Cat) cat).climb();
    }
}
