package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens

*/

public class Solution {
    public static Cat cat;
    
    static { // before we can do anything else lets do the static block
        cat = new Cat();
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
    }
    
    //  In the Solution class, create a Cat class with a public String field name.
    public static class Cat {
        public String name = "Tom";
    }
}
