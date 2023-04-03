package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        //Save the current PrintStream in a special variable
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutStream = new FileOutputStream(reader.readLine());
        PrintStream consoleStream = System.out;
        
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    
        //Create an adapter for the PrintStream class
        PrintStream stream = new PrintStream(outStream);
    
        System.setOut(stream);
    
        testString.printSomething();
    
        //Convert the data written to our ByteArray into a string
        String result = outStream.toString();
        
        System.setOut(consoleStream);
    
        fileOutStream.write(result.getBytes());
        System.out.println(result);
        
        fileOutStream.close();
        reader.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

