package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        FileInputStream inputStream = null;
        BufferedReader bufferedReader = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            String fileName = bufferedReader.readLine();
            
            inputStream = new FileInputStream(fileName);
    
            List<Integer> numbers = new ArrayList();
            
            for (; inputStream.available() > 0 ;) {
                String collection = "";
                
                for (; inputStream.available() > 0 ;) {
                    char num = (char) inputStream.read();
                    if (Character.toString(num).equals("\n"))
                        break;
                    collection += Character.valueOf(num);
                }
                
                if (Integer.parseInt(collection) % 2 == 0)
                    numbers.add(Integer.parseInt(collection));
            }
    
            Collections.sort(numbers);
            numbers.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            bufferedReader.close();
        }
    }
}
