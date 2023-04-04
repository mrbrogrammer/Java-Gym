package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
        
        Map<String, List<Double>> map = new HashMap<>();
        
        while (inStream.ready()) {
            List<Double> list = new ArrayList<>();
            
            String string = inStream.readLine();
            
            String[] strings = string.split(" ");
            
            if (map.containsKey(strings[0])){
                map.get(strings[0]).add(Double.valueOf(strings[1]));
            } else {
                list.add(Double.valueOf(strings[1]));
                map.put(strings[0], list);
            }
            
        }
        
        List<Double> list = new ArrayList<>();
        
        Map<String, Double> mapTotal = new HashMap<>();
        for (Map.Entry<String, List<Double>> pair : map.entrySet()) {
            
            double a =  pair.getValue().get(0);
            for (int index = 1; index < pair.getValue().size(); index++) {
                a += pair.getValue().get(index);
            }
    
            list.add(a);
            mapTotal.put(pair.getKey(), a);
        }
        
        list.sort(null);
        
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Double> pair : mapTotal.entrySet()) {
            if (Objects.equals(pair.getValue(), list.get(list.size() - 1))) {
                result.add(pair.getKey());
            }
        }
        
        result.sort(null);
    
        result.forEach(System.out::println);
    
        inStream.close();
    }
}
