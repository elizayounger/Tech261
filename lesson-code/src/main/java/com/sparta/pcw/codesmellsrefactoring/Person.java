package com.sparta.pcw.codesmellsrefactoring;

// feature envy
// repeated switch or if else statements

public class Person {
    private final String firstName;
    private final String lastName;
    private Address address = new Address();
    private int age;
    // set the address other than when you make the person.
    // some things are initialised but not set and other things aren't.


    public Person(String firstName, String lastName) // method has same name as overall class which is confusing
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // constructor overloader.
    public Person(String fName, String lName, Address address) {
        this(fName, lName);
        this.address = address;
    }
    // shouldn't age be initialised here?
    // separate out into address class?

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";
        //      System.out.println("Can't get here");
    }

    @Override
    public String toString() { // gets address and returns as string
        var addressString = "Address: " + address.getHouseNumber() + " " + address.getStreet() + ", " + address.getTown();

        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }

        return String.format("%s Name: %s  %s Age: %s. %s",
                super.toString(),
                firstName,
                lastName,
                age,
                addressString);
    }
    // ternary condition?

//    public int stupidMethod()
//    {
//        return 3;
//    }
}