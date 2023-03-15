package com.codegym.task.task15.task1508;

/* 
OOP: Method overloading - Eliminating the superfluous

OOP: Method overloading - Eliminating the superfluous
1. Think about which implementation of the print method will be called.
2. Remove any superfluous implementations of the print method.


Requirements:
1. Other than the main method, the Solution class should only have a single print method (with the correct parameter!).
2. The print method must be public.
3. The print method must be static.
4. The program should display "I will be a Java programmer!".
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(long l) { // if not int a long will be called first
        System.out.println("I will be a Java programmer!");
    }
}
