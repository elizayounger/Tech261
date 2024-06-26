package com.sparta.ey.singleton;

public class SingletonExample {
    private static final SingletonExample SINGLETON_EXAMPLE = new SingletonExample();

    private SingletonExample() { } // unable to use the constructor as it's private

    public static SingletonExample getSingletonExample() {
        return SINGLETON_EXAMPLE;
    }
}
//  method can return abstract type that will return a dog or a goldfish depending what you pass to the method.

// switch statement gives access to ojbects but hides how they are created
//