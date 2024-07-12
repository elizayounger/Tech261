package com.sparta.ey;

import com.sparta.ey.exceptions.CorruptedDateException;

public class ExceptionCreator {
    static void getException() throws ArithmeticException {
        System.out.println(1 / 0);
    }

    public static void getCheckedException() throws InterruptedException, CorruptedDateException {
        // Code
//        throw new InterruptedException();
        throw new CorruptedDateException("Date is not valid");
    }
}

