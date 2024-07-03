package com.sparta.ey;

import java.util.Arrays;
// there is a limit in type not in number of objects.
// you can have as many enums as you want but if you create an instance of the class then it has to be one of the ones specified.
// you can't extend an enum parent class beccause they already have a parent.
public enum ChoirVoices { // these are stored as constants
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        Days dayOff = Days.FRIDAY; // create objects. each object has to be one of these.

        System.out.println(dayOff.describeConstable());

        System.out.println(dayOff.compareTo(FRIDAY));
        System.out.println(dayOff.compareTo(THURSDAY));
        System.out.println(dayOff.compareTo(SATURDAY));
        System.out.println(Arrays.toString(Days.valueOf("FRIDAY")));
    }
}
