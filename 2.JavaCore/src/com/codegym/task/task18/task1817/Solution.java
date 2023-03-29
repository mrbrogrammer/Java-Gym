package com.codegym.task.task18.task1817;

/* 
Spaces


Spaces
The first parameter of the main method is a file name.
Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count all the characters (n1).
2. Count the spaces (n2).
3. Display n2/n1*100, rounding to 2 decimal places.
4. Close the streams.


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. Calculate and display the ratio of the spaces to all characters in the file.
4. The displayed value must be rounded to 2 decimal places.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        
        float countSpace = 0;
        float countCharacter = 0;
        while (fileInputStream.available() > 0) {
            char c = (char) fileInputStream.read();
        
            if (c == ' ')
                countSpace++;
            
            countCharacter++;
            
        }
        fileInputStream.close();
 
        System.out.format("%.2f ", (countSpace / countCharacter) * 100);

    }
}
