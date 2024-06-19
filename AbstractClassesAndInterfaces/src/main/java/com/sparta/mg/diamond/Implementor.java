package com.sparta.mg.diamond;

public class Implementor implements InterfaceOne, InterfaceTwo {

    @Override
    public String diamondMethod() {
        return InterfaceOne.super.diamondMethod();
    }
}
