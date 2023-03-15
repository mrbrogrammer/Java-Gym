package com.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Fix four mistakes

*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
    }
        static List initList(List<Number> list) {
            // 3
            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float((float) (- 90 / - 3)));
            list.remove(new Double("123e-445632"));
            
            return list;
        }
        static void printListValues(List<Number> list) {
            // 4 - Correct 2 bugs
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        
        static void processCastObjects(List<Number> list) {
            // 5
            for (Number object : list) {
                // Correct 2 bugs
                if (object instanceof Float) {
                    Float a = (Float) object;
                    System.out.println("Is float defined? " + ! (a.isNaN()));
                } else if (object instanceof Double) {
                    Double a = (Double) object;
                    System.out.println("Is double infinite? " + a.isInfinite());
                }
            }
        }
    
}
