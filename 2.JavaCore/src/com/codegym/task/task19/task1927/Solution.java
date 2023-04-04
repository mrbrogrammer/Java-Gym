package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //Save the current PrintStream in a special variable
        PrintStream consoleStream = System.out;
        
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    
        PrintStream stream = new PrintStream(outStream);
        
        System.setOut(stream);
    
        testString.printSomething();
    
        String result = outStream.toString();
        
        
        System.setOut(consoleStream);
        
        String[] strings = result.split("\n");
    
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("CodeGym - online Java courses");
            }
            System.out.println(strings[i]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
