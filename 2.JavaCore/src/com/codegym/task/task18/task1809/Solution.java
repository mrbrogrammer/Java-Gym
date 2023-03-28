package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream file1InStream = new FileInputStream(reader.readLine());
        FileOutputStream file2outStream = new FileOutputStream(reader.readLine());
    
        List<Byte> buffer = new ArrayList<>();
        
        
        
        while (file1InStream.available() > 0) {
            int count = file1InStream.read();
            buffer.add((byte) count);
        }
    
    
        for (int index = buffer.size() - 1; index > -1; index--) {
            file2outStream.write(buffer.get(index));
        }
    
        file1InStream.close();
        file2outStream.close();
    
    }
}
