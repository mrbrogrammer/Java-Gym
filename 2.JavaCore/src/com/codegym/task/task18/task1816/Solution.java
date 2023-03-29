package com.codegym.task.task18.task1816;

/* 
ABCs

ABCs
The first parameter of the main method is a file name.
Count the letters of the English alphabet in the file.
Display the number of letters.
Close the streams.


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. You need to count the letters of the English alphabet in the file and display the number.
4. You must count both uppercase and lowercase letters.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int counter = 0;
        while (fileInputStream.available() > 0) {
            int c = fileInputStream.read();
    
            if (Integer.parseInt(Integer.toOctalString(c)) > 100 && Integer.parseInt(Integer.toOctalString(c)) < 133)
                counter++;
            else if (Integer.parseInt(Integer.toOctalString(c)) > 60 && Integer.parseInt(Integer.toOctalString(c)) < 173) {
                counter++;
            }
        }
        
        System.out.println(counter);
        
        fileInputStream.close();
    }
}
