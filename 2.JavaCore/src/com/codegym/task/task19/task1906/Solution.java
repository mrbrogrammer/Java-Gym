package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
    
        FileReader reader = null;
        FileWriter writer = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            reader = new FileReader(bufferedReader.readLine());
            writer = new FileWriter(bufferedReader.readLine());
    
            StringBuilder result = new StringBuilder();
            while (reader.ready()) {
                char s = (char) reader.read();
                result.append(s);
            }
            
            for (int index = 0; index < result.length(); ) {
                if (index % 2 != 0) {
                    writer.write(result.charAt(index));
                }
                index += 1;
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
