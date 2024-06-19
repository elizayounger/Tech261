package com.sparta.ey;
package Polymorism;

public class Animals {
    public static void main(String[] args) {
        DangerousAnimal lion = new Lion("African Lion", "savannah", 8, 144.0);
        lion.displayInfo();
        lion.move();
        System.out.println();
        DangerousAnimal shark = new Shark("Great White Shark", "ocean", 9, 300);
        shark.displayInfo();
        shark.move();
    }

    public static class DangerousAnimal {
        private String name;
        private String habitat;
        private int dangerLevel; // Scale from 1 to 10 public

        DangerousAnimal(String name, String habitat, int dangerLevel) {
            this.name = name;
            this.habitat = habitat;
            this.dangerLevel = dangerLevel;
        }

        public String getName() {
            return name;
        }

        public String getHabitat() {
            return habitat;
        }

        public int getDangerLevel() {
            return dangerLevel;
        }

        public boolean displayInfo() {
            System.out.println("Animal: " + name);
            System.out.println("Habitat: " + habitat);
            System.out.println("Danger Level: " + dangerLevel);
            return false;
        }

        public void move() {
            System.out.println(name + " is moving...");
        }
    }

    public static class Lion extends DangerousAnimal {
        private double roarVolume;

        public Lion(String name, String habitat, int dangerLevel, double roarVolume) {
            super(name, habitat, dangerLevel);
            this.roarVolume = roarVolume;
        }

        public double getRoarVolume() {
            return roarVolume;
        }

        @Override
        public boolean displayInfo() {
            super.displayInfo();
            System.out.println("Roar Volume: " + roarVolume + " dB");
            return false;
        }

        @Override
        public void move() {
            System.out.println(getName() + " is running across the " + getHabitat());
        }
    }

    public static class Shark extends DangerousAnimal {
        private int numberOfTeeth;

        public Shark(String name, String habitat, int dangerLevel, int numberOfTeeth) {
            super(name, habitat, dangerLevel);
            this.numberOfTeeth = numberOfTeeth;
        }

        public int getNumberOfTeeth() {
            return numberOfTeeth;
        }

        @Override
        public boolean displayInfo() {
            super.displayInfo();
            System.out.println("Number of Teeth: " + numberOfTeeth);
            return false;
        }

        @Override
        public void move() {
            System.out.println(getName() + " is swimming in the " + getHabitat());
        }
    }
}