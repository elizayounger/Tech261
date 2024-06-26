package com.sparta.ey;

public class SegregatedDrinksMachines {
    public class BasicDrinksMachine implements SegregatedIDrinksMachine {
        @Override
        public void makeTea() {
            System.out.println("Making tea...");
        }

        @Override
        public void makeBlackCoffee() {
            System.out.println("Making black coffee...");
        }
    }


    public class AdvancedDrinksMachine implements SegregatedIDrinksMachine, SegregatedEspressoMachine {
        @Override
        public void makeTea() {
            System.out.println("Making tea...");
        }

        @Override
        public void makeBlackCoffee() {
            System.out.println("Making black coffee...");
        }

        @Override
        public void makeEspresso() {
            System.out.println("Making espresso...");
        }
    }
}
