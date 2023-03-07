package com.codegym.task.task01.task0136;

/* 
Even to the moon!

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        // write your code here
        double a = new Double(17), b = new Double(100);
        return a/b * earthWeight;
    }
}