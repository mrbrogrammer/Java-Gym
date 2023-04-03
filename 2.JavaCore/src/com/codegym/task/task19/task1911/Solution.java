package com.codegym.task.task19.task1911;

/* 
Reader wrapper

*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
    
        //Save the current PrintStream in a special variable
        PrintStream consoleStream = System.out;
        
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    
        //Create an adapter for the PrintStream class
        PrintStream stream = new PrintStream(outStream);
    
        System.setOut(stream);
        
        testString.printSomething();
    
        //Convert the data written to our ByteArray into a string
        String result = outStream.toString();
    
        System.setOut(consoleStream);
    
        System.out.println(result.toUpperCase());
    
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
