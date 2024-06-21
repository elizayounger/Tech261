package com.sparta.ey;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

    }

    public static void set() {
        // how to make ordinary set
        Set<String> hash_Set = new HashSet<String>();

        // how to make linked hashset
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("apple");

        // comes up with hashcode for the object
        linkedHashSet.hashCode();

    }
}
