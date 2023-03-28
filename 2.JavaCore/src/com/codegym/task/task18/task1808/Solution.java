package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream file1InStream = new FileInputStream(reader.readLine());
        FileOutputStream file2outStream = new FileOutputStream(reader.readLine());
        FileOutputStream file3outStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[file1InStream.available()];
        while (file1InStream.available() > 0) {
            int count = file1InStream.read();
            if (file1InStream.available() < buffer.length / 2) {
                file3outStream.write(count);
            } else {
                file2outStream.write(count);
            }
        }
        
        file1InStream.close();
        file2outStream.close();
        file3outStream.close();
    }
}
