package com.codegym.task.task15.task1509;

/*
Man or woman?

Man or woman?
1. Change the printName method so that it runs for both man and woman.
2. The printName method should have a single implementation.


Requirements:
1. The Solution class should only implement a single printName method.
2. The printName method must have one Human parameter.
3. The Man class must be a descendant of the Human class.
4. The Woman class must be a descendant of the Human class.
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human man) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
