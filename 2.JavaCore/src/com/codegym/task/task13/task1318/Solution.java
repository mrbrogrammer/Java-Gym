package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        FileInputStream inStream = null;
        BufferedReader bufferedReader = null;
        
        
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            inStream = new FileInputStream(bufferedReader.readLine());
    
            while (inStream.available() > 0) {
                char s = (char) inStream.read();
                if (Character.valueOf(s).equals(" ")) System.out.println();
                System.out.print(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            bufferedReader.close();
        }
    }
}