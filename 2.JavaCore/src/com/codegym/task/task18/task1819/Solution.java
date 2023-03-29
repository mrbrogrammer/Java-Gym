package com.codegym.task.task18.task1819;

/* 
Combining files

Combining files
Read 2 file names from the console.
Write the contents of the second file to the beginning of the first file so that the files are combined.
Close the streams.


Requirements:
1. The program should read a file name twice from the console.
2. Create an input stream for the first file and read its contents.
3. Then create an output stream for the first file. And an input stream for the second file.
4. The contents of the first and second files must be combined in the first file.
5. The contents of the second file should go first, then the contents of the first file.
6. The file streams must be closed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        
        FileInputStream file1InStream = new FileInputStream(filename1);
        
        List<Character> tmp = new ArrayList<>();
        while (file1InStream.available() > 0) {
            char count = (char) file1InStream.read();
            tmp.add(count);
        }
        
        file1InStream.close();
    
        FileInputStream file2InStream = new FileInputStream(filename2);
        FileOutputStream file1OutStream = new FileOutputStream(filename1);
        
        byte[] buffer2 = new byte[file2InStream.available()];
        while (file2InStream.available() > 0) {
            int count = file2InStream.read(buffer2);
            file1OutStream.write(buffer2, 0, count);
        }
        
        file2InStream.close();

        int counter = 0;
        while (counter != tmp.size()) {
            file1OutStream.write(tmp.get(counter));
            counter++;
        }
        
        file1OutStream.close();
    }
}
