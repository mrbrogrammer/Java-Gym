package com.codegym.task.task19.task1910;

/* 
Punctuation

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
    
            StringBuilder string = new StringBuilder();
            while (reader.ready()) {
                char s = (char) reader.read();
                string.append(s);
            }
    
            string = new StringBuilder(string.toString().replaceAll("\\p{Punct}", ""));
            string = new StringBuilder(string.toString().replaceAll("\\n", ""));
    
            writer.write(string.toString());
    
    
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
