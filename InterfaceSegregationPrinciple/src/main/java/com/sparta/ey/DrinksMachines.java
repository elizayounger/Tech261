package com.sparta.ey;

public class DrinksMachines {

    public class BasicDrinksMachine implements IDrinksMachine {
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

            // BasicDrinksMachine does not need to implement makeEspresso :(
            throw new UnsupportedOperationException();
        }
    }


    public class AdvancedDrinksMachine implements IDrinksMachine {
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
