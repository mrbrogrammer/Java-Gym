package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = null;
        BufferedWriter outputStream = null;
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            outputStream = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
            
            while (true) {
                String s = bufferedReader.readLine();
                outputStream.write(s);
                outputStream.newLine();
                
                if (s.equals("exit")){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            outputStream.close();
        }
        
    
    }
}
