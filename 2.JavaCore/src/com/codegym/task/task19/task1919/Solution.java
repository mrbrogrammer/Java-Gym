package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
    
        Map<String, List<Float>> map = new HashMap<>();
        
        while (inStream.ready()) {
            List<Float> list = new ArrayList<>();
            
            String string = inStream.readLine();
            
            String[] strings = string.split(" ");
            
            if (map.containsKey(strings[0])){
                map.get(strings[0]).add(Float.valueOf(strings[1]));
            } else {
                list.add(Float.valueOf(strings[1]));
                map.put(strings[0], list);
            }
            
        }
    
        TreeSet<String> set = new TreeSet();
        for (Map.Entry<String, List<Float>> pair : map.entrySet()) {
    
            float a =  pair.getValue().get(0);
            for (int index = 1; index < pair.getValue().size(); index++) {
                a += pair.getValue().get(index);
            }
    
            set.add(pair.getKey() + " " + a);
            
        }
    
        Iterator<String> iterator = set.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        inStream.close();
    }
}
