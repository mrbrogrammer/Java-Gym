package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

Finding data inside a file
Read a file name from the console.
Search the file for information related to the specified id. Display it in the format used in the file.
The program is started with one argument: id (an int).
Close the streams.

The file data is separated by spaces and stored in the following order:
id productName price quantity
where id is an int
productName is a String — it can contain spaces
price is a double
quantity is an int

The inform   ation for each product is stored on a separate line.


Requirements:
1. The program should read a file name from the console.
2. Create an input stream for the file.
3. The program should search the file and display information related to the specified id passed as the first argument.
4. The stream used to read the file must be closed.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
        
        String buffer = "";
        SortedMap<Integer, String[]> map = new TreeMap<>();
        while (inputStream.available() > 0) {
            char c = (char) inputStream.read();
            
            if (!(c == '\n')) {
                buffer += c;
            }
            if (c == '\n' || inputStream.available() == 0){
                String[] elements = buffer.split(" ");
                int id = Integer.parseInt(elements[0]);
                String[] details = Arrays.copyOfRange(elements, 1, elements.length);
                
                map.put(id, details);
                buffer = "";
            }
        }
        
        inputStream.close();
    
        String[] result = map.get(Integer.parseInt(args[0]));
    
        System.out.print(args[0]);
        for (int index = 0; index < result.length; index++) {
            System.out.print(" " + result[index]);
        }
        
    }
}
