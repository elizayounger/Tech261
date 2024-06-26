package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    private int houseNumber = 0; // what if house only has a name, not a number
    private String street = "";
    private String town = "";

    public Address(int houseNumber, String street, String town) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.town = town;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Address() {
    }
}