package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
    
        BufferedReader reader = null;
        BufferedWriter writer = null;
    
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
            reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
            writer = new BufferedWriter( new FileWriter(bufferedReader.readLine()));
        
            
            while (reader.ready()) {
                char s = (char) reader.read();
                if (s == '.') {
                    writer.write("!");
                } else {
                    writer.write(s);
                }
            }
            
        
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
