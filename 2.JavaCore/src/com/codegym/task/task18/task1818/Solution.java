package com.codegym.task.task18.task1818;

/* 
Two in one

Two in one
Read 3 file names from the console.
Write the contents of the second file to the first file, and then append the contents of the third file to the first file.
Close the streams.


Requirements:
1. The program should read a file name three times from the console.
2. Create an output stream for the first file. For the other two, create input streams.
3. The contents of the second file must be copied to the first file.
4. The contents of the third file must be appended to the first file (after the second file has been written to the first file).
5. The file streams must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        FileOutputStream file1OutStream = new FileOutputStream("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task18/task1818/file1.txt.txt");
        FileInputStream file2InStream = new FileInputStream("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task18/task1818/file2.txt.txt");
        FileInputStream file3InStream = new FileInputStream("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task18/task1818/file3.txt");
    
        byte[] buffer = new byte[file2InStream.available()];
        while (file2InStream.available() > 0) {
            int count = file2InStream.read(buffer);
            file1OutStream.write(buffer, 0, count);
        }
    
        byte[] buffer2 = new byte[file3InStream.available()];
        while (file3InStream.available() > 0) {
            int count = file3InStream.read(buffer2);
            file1OutStream.write(buffer2, 0, count);
        }
        
        
    
        file1OutStream.close();
        file2InStream.close();
        file3InStream.close();
    }
}
