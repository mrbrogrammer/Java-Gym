package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
    
        LinkedList<Integer> bytes = new LinkedList<>();
    
        while (inputStream.available() > 0) {
            int b = inputStream.read();
            bytes.add(b);
        }
    
        inputStream.close();
        
        int mincount = Integer.MAX_VALUE;
        HashMap<Integer, Integer> elementHavingMinFreq = new HashMap<>();
        for (int i = 0; i < bytes.size(); i++) {
            int count = 0;
            for (int j = 0; j < bytes.size(); j++) {
                if (bytes.get(i) == bytes.get(j))
                    count++;
            }
            
            elementHavingMinFreq.put(bytes.get(i), count);
            if (count < mincount) {
                mincount = count;
            }
        }
    
        for (HashMap.Entry<Integer, Integer> entry : elementHavingMinFreq.entrySet()) {
            if (entry.getValue().equals(mincount)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    
    }
}
