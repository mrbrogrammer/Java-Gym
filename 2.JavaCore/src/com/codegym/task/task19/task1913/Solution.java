package com.codegym.task.task19.task1913;

/* 
Output only digits

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
        for (int index = 0; index < result.length(); index++) {
           if (String.valueOf(result.charAt(index)).matches("[0-9]")) {
               numbers.append(result.charAt(index));
           }
        }
    
        System.out.println(numbers);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
