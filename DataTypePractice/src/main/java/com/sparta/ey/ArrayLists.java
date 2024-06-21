package com.sparta.ey;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

    }

    public static void arrayLists() {
        String[] collection = {"Apple"};
        String[] collections = {"Apple"};

        // turn string[] into arrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(collection));

        ArrayList arr = new ArrayList(collections);

        arrayList.add("apple");

        // turn into string
        arrayList.toString();

        // turn arrayList into string[]
        String[] stringListReturn = arrayList.toArray(new String[arrayList.size()]);

        // comes up with hashcode for the object
        arrayList.hashCode();


    }
}

