package com.codegym.task.task18.task1824;

/* 
Files and exceptions

Files and exceptions
Read file names from the console.
If the file does not exist (i.e. an invalid file name is given), then catch the FileNotFoundException, display the invalid file name, and exit the program.
Close the streams.
Don't use System.exit();


Requirements:
1. The program should read file names from the console.
2. You need to create an input stream for each file.
3. If the file does not exist, the program must catch the FileNotFoundException.
4. After catching the exception, the program should display the file name and exit.
5. The file input streams must be closed.
6. Don't use "System.exit();".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            
            try (FileInputStream inStream = new FileInputStream(fileName)) {
            
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
