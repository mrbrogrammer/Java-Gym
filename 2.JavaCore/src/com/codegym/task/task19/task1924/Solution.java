package com.codegym.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    
    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        BufferedReader inStream = new BufferedReader(new FileReader(bufferedReader.readLine()));
    
        List<String> lines = new ArrayList<>();
        while (inStream.ready()) {
            String line = inStream.readLine();
            lines.add(line);
        }
    
        String punctuations = ".,:;";//add all the punctuation marks you want.
//        if(punctuations.contains(letter[a]))
        List<String> words = new ArrayList<>();
        for (int index = 0; index < lines.size(); index++) {
            String[] strings = lines.get(index).split(" ");
            String result = "";
            
            for (int i = 0; i < strings.length; i++) {
                try {
                    if (strings[i].substring(strings[i].length() -1).matches("\\p{Punct}")) {
                        int num = Integer.parseInt(strings[i].substring(0,strings[i].length() - 1));
                        if (map.containsKey(num)) {
                            for (Map.Entry<Integer, String> pair: map.entrySet()) {
                                if (pair.getKey() == num) {
                                    strings[i] = strings[i].replace(String.valueOf(num), pair.getValue());
                                }
                            }
                        }
                    } else {
                        int num = Integer.parseInt(strings[i]);
                        if (map.containsKey(num)) {
                            for (Map.Entry<Integer, String> pair: map.entrySet()) {
                                if (pair.getKey() == num) {
                                    strings[i] = pair.getValue();
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                
                }
            }
        
            for (int i = 0; i < strings.length; i++) {
                result += " " + strings[i];
            }
            System.out.println(result.trim());
            
        }
        
        bufferedReader.close();
        inStream.close();
    }
}
