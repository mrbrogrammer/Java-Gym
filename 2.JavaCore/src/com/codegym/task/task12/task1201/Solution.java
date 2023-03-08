package com.codegym.task.task12.task1201;

/* 
Whales and cows

*/

public class Solution {
    public static void main(String[] args) {
        /*
        * gets all the Cow type method but gets the specific method from the whale object
        * */
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "I'm not a cow. I'm a whale.";
        }
    }
}
