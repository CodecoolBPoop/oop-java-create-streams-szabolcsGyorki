package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {

    private static int n1=0;
    private static int n2=1;
    private static int n3=0;

    private static void getNextFib(){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }

    @Override
    public Integer get() {
        Integer currentFib = n3;
        getNextFib();
        return currentFib;
    }
}
