package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

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
    
        
        
        StringBuilder numbers = new StringBuilder();
        
        int[] a = new int[3];
        int count = 0;
        
        String[] list = result.split(" ");
        
        for (int index = 0; index < list.length - 1; index++) {
            try {
                a[count] = Integer.parseInt(list[index]);
                ++count;
            } catch (Exception e) {
            
            }
        }
    
        int number = 0;
        if (result.contains("+")) {
            number = a[0] + a[1];
        } else if (result.contains("-")) {
            number = a[0] - a[1];
        } else if (result.contains("*")) {
            number = a[0] * a[1];
        } else if (result.contains("/")) {
            number = a[0] / a[1];
        }
        
    
        System.out.println(result.substring(0, result.length()- 1) + String.valueOf(number));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

