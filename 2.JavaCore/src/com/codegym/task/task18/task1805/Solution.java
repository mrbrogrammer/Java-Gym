package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
    
        TreeSet<Integer> bytes = new TreeSet();
    
        while (inputStream.available() > 0) {
            int b = inputStream.read();
            bytes.add(b);
        }
    
    
        for (Integer entry : bytes) {
            System.out.print((entry + " "));
        }
        
        inputStream.close();
        
    }
}
