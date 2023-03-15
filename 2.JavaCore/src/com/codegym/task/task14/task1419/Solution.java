package com.codegym.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;
            
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //write your code here
        exceptions.add(new RuntimeException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IOException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new NoSuchElementException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new NumberFormatException());
    }
}
