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
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        // must add input from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedReader inStream = new BufferedReader(new FileReader(bufferedReader.readLine()));
    
        List<String> list = new ArrayList<>();
        while (inStream.ready()) {
            String string = inStream.readLine();
            list.add(string);
        }
    
        inStream.close();
    
    
        StringBuffer word = new StringBuffer();
        for (int index = 0; index < list.size(); index++) {
            
            // the number of words differs. So, split accordingly
            String[] strings = list.get(index).split(" ");
            
            String line = "";
            int count = 0;
            int counter = 0;
            int wrong = 0;
            int size = Math.max(strings.length, words.size());
            for (int i = 0; i < size; i++) {
                // possibly check all elements.
                try {
                    for (int j = 0; j < strings.length; j++) {
                        if (words.get(i).equals(strings[j])) {
                            count++;
                        } else {
                            wrong++;
                        }
                        
                    }
                } catch(IndexOutOfBoundsException e) {
        
                }
                
                line += " " + strings[i];
                
               counter++;
               
            }
            
            System.out.println("wrong = " + wrong / words.size());
            if (count == 2) {
                System.out.println(line.trim());
            }
        }
        
        
        bufferedReader.close();
        inStream.close();
    }
}
