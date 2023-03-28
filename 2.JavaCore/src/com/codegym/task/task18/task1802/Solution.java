package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Minimum byte
Minimum byte
Enter a file name from the console.
Find the minimum byte in the file. Display it on the screen.
Close the IO stream.


Requirements:
1. The program should read a file name from the console.
2. Use a FileInputStream to read from the file.
3. The program should display minimum byte read from the file.
4. The stream used to read the file must be closed.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(reader.readLine());
    
        reader.close();
        List<Byte> bytes = new ArrayList<>();
    
        while (inputStream.available() > 0) {
            byte b = (byte) inputStream.read();
            bytes.add(b);
        }
    
        inputStream.close();
    
        System.out.println(Collections.min(bytes));
    }
}
