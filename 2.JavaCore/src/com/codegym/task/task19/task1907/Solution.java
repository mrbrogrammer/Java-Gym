package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        FileReader reader = null;
    
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            reader = new FileReader(bufferedReader.readLine());
            
            
            StringBuilder text = new StringBuilder();
            while (reader.ready()) {
                char c = (char) reader.read();
                text.append(c);
                
            }
         
            String[] result = text.toString().split("\\W");
    
            int count = 0;
            for (int index = 0; index < result.length; index++) {
               if (Objects.equals(result[index], "world")){
                   count++;
               }
            }

            System.out.println(count);
    
        } finally {
            assert reader != null;
            reader.close();
            bufferedReader.close();
        
        }
    }
}
