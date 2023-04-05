package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("A");
        words.add("B");
        words.add("C");
    }

    public static void main(String[] args) throws IOException {
        // must add input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        br.close();
        String s ;
    
        while (br1.ready()) {
            s = br1.readLine();
            String[] str = s.split(" ");
            int count = 0;
            for (String s1 : str) {
                
                for (String word : words) {
                    if (s1.equals(word)) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
        }
        br1.close();
    }
}
