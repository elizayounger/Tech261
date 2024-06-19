package com.sparta.mg.diamond;

public interface InterfaceOne {
    default String diamondMethod() {
        return "I am in Interface One";
    }
}
