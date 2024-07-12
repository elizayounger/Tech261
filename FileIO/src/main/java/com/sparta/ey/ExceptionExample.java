package com.sparta.ey;

import com.sparta.ey.exceptions.CorruptedDateException;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {
//        ExceptionCreator.getException();
        try {
            ExceptionCreator.getCheckedException();
        } catch (CorruptedDateException e) {
            e.printStackTrace();
        }
    }
}
