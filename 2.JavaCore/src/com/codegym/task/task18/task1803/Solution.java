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
    
        System.out.println(bytes);
        Set<Integer> set = new HashSet<>();
        Set<Integer> diffSet = new HashSet<Integer>();
        List<Byte> result = new ArrayList<>();
        for (int index = 0; index < bytes.size(); index++) {
            if (!set.contains(Integer.valueOf(bytes.get(index)))) {
                set.add(Integer.valueOf(bytes.get(index)));
            } else {
                if (!(diffSet.contains(Integer.valueOf(bytes.get(index))))) {
                    diffSet.add(Integer.valueOf(bytes.get(index)));
                }
//                else {
                result.add(bytes.get(index));
                System.out.print(bytes.get(index) + " ");
//                }
                
            }
        }
        System.out.println();
        int count = 0;
        for (int index = 0; index < bytes.size(); index++) {
            if (bytes.contains(result.get(count))) {
                bytes.remove(result.get(count));
            }
    
            if (count < result.size() -1){
                count++;
            }

            System.out.print(bytes.get(index) + " ");
        }
//        bytes.remove(result.get(0));
    
//        System.out.println(bytes);

//        for (int index = 0; index < result.size(); index++) {
////            if (result.get(index).compareTo(result.get(result.size() -1)) == 0) {
////                continue;
////            }
//            System.out.print(result.get(index) + " ");
//        }
    }
}
