package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String url = reader.readLine();
        
        StringTokenizer token1 = new StringTokenizer(url);
        
        List<String> list = new ArrayList<>();
        int index = 0;
        while (token1.hasMoreElements()) {
            list.add(token1.nextToken("?"));
            if (list.get(index).contains("&")) {
                StringTokenizer token2 = new StringTokenizer(list.get(index));
                while (token2.hasMoreElements())
                    list.add(token2.nextToken("&"));
            }
            index++;
        }
    
        Map<String, String> map = new HashMap<>();
        for (int i = 2; i < list.size(); i++) {
            String[] pair = list.get(i).split("=");
            System.out.print(pair[0] + " ");
            if (pair.length == 2)
                map.put(pair[0], pair[1]);
            else {
                map.put(pair[0], String.valueOf(i));
            }
        }
        
        System.out.println();
        
        for (Map.Entry<String, String> pair: map.entrySet()){
            if (pair.getKey().equals("obj")) {
                try {
                   double result = Double.parseDouble(pair.getValue());
                   alert(result);
                } catch (NumberFormatException e) {
                    alert(pair.getValue());
                }
                
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
