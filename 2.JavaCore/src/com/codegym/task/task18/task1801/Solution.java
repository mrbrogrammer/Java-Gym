package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        FileInputStream inputStream = new FileInputStream(reader.readLine());
    
        reader.close();
        List<Byte> bytes = new ArrayList<>();
        
        while (inputStream.available() > 0) {
            byte b = (byte) inputStream.read();
            bytes.add(b);
        }
        
        inputStream.close();
    
        System.out.println(Collections.max(bytes));
    
    }
}
