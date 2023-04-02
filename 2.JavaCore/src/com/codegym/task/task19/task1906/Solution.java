package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
        
        String result = "";
        while (reader.ready()) {
            int s = reader.read();
            result += s;
        }
    
        System.out.println("result = " + result);
    }
}
