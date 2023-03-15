package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
    
        if (a < 1 || b < 1) {
            throw new Exception();
        }
        
        List<Integer> divisorA = new ArrayList<>();
        for (int index = 1; index <= a; index++) {
            if (a % index == 0) {
                divisorA.add(index);
            }
        }
    
        List<Integer> divisorB = new ArrayList<>();
        for (int index = 1; index <= b; index++) {
            if (b % index == 0) {
                divisorB.add(index);
            }
        }
    
        int result = 0;
        for (int i = 0; i < divisorA.size(); i++) {
            for (int j = 0; j < divisorB.size(); j++) {
                if (divisorA.get(i).equals(divisorB.get(j))) {
                    result = divisorA.get(i);
                }
            }
        }
    
        System.out.println(result);
    
    
    }
}
