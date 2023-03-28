package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
    
        bufferedReader.close();
        
        int count = 0;
        while (inputStream.available() > 0) {
            char b = (char) inputStream.read();
            if (b == ','){
                ++count;
            }
        }
    
        inputStream.close();
        
        System.out.println(count);
        
        
    }
}
