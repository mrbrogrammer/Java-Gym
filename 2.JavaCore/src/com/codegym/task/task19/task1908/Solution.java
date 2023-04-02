package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
    
        BufferedReader reader = null;
        BufferedWriter writer = null;
    
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
            reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
            writer = new BufferedWriter( new FileWriter(bufferedReader.readLine()));
        
            String string = "";
            while (reader.ready()) {
                char s = (char) reader.read();
                    string+=s;
                
            }
            
            String[] list = string.split(" ");
            
            String number = "";
            for (int i = 0; i < list.length; i++) {
                try {
                    Integer.parseInt(list[i]);
                    number += " " + list[i];
                    
                } catch (Exception e) {
                
                }
            }
            
            
            writer.write(number.substring(1));
    
    
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert writer != null;
            writer.close();
            reader.close();
            bufferedReader.close();
        }
    }
}
