package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(reader.readLine());
    
        LinkedList<Byte> bytes = new LinkedList<>();
        
        while (inputStream.available() > 0) {
            byte b = (byte) inputStream.read();
            bytes.add(b);
        }
        
        inputStream.close();
    
        Set<Integer> set = new HashSet<>();
        Set<Integer> diffSet = new HashSet<Integer>();
        for (int index = 0; index < bytes.size(); index++) {
            if (!set.contains(Integer.valueOf(bytes.get(index)))) {
                set.add(Integer.valueOf(bytes.get(index)));
            } else {
                if (!(diffSet.contains(Integer.valueOf(bytes.get(index))))) {
                    diffSet.add(Integer.valueOf(bytes.get(index)));
                } else {
                    System.out.print(bytes.get(index) + " ");
                }
                
            }
        }
    }
}
