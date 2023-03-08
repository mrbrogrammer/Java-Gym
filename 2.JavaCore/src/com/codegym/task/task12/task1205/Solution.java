package com.codegym.task.task12.task1205;

/* 
Animal identification

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //write your code here
        if (o instanceof Cow) {
            return o.getClass().getSimpleName();
        } else if (o instanceof Dog) {
            return o.getClass().getSimpleName();
        } else if (o instanceof Whale) {
            return o.getClass().getSimpleName();
        } else {
            return "Unknown Animal";
        }
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
