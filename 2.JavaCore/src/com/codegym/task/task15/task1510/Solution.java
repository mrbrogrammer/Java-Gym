package com.codegym.task.task15.task1510;

/*
Be gone, all that is unnecessary!

In the main method, remove the superfluous lines for which the add method is not implemented.


Requirements:
1. There must be three add() methods implemented in the Solution class.
2. You need to remove the extra lines in the main() method.
3. All of the Solution class's methods must be static.
4. All of the Solution class's methods must be public.
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
