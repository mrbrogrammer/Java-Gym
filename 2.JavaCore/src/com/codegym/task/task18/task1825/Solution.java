package com.codegym.task.task18.task1825;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.*;

/* 
Building a file

Building a file
Let's build a file from various pieces.
Read file names from the console.
Each file has a name: <someName>.partN.

For example, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

The file names are supplied in random order. The word "end" is used to stop reading in file names.
In the folder where all the files are located, create a file without the "part" suffix, i.e. without ".<partN>".

For example, Lion.avi.

Use a buffer to copy all the bytes from the partial files to the created file.
Copy the first in the proper order, first the first part, then the second, ..., finally - the last part.
Close the streams.


Requirements:
1. The program must read file names from the console until the word "end" is entered.
2. Create a stream to write to the file without the "part" suffix (".<partN>") in the folder with all the "part" files.
3. Copy all the bytes from the *.partN files to the new file.
4. You should use a buffer for the reading and writing.
5. The file streams must be closed.
6. Don't use static variables.
*/

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileNames = new ArrayList<>();
        String p = "";
        while (true) {
            String file = reader.readLine();
            
            if (file.equals("end") ) {
                break;
                
            }
            fileNames.add(file);
        }
    
        BufferedReader inputStream;
        SortedMap<Integer, List<Integer>> map = new TreeMap<>();
        for (String allFileName : fileNames) {
    
            List<Integer> bytes = new ArrayList<>();
    
            inputStream = new BufferedReader(new FileReader(allFileName));
//            String[] list = allFileName.split("\\/");
//            String fileName = list[list.length -1];
            String[] splitList = allFileName.split("\\.");
        
            p = splitList[0] + "." + splitList[1];
            
            while (inputStream.ready()) {
                char counter = (char) inputStream.read();
            
                bytes.add((int) counter);
            }
            
            map.put((int) splitList[2].charAt(splitList[2].length() - 1), bytes);
            
            inputStream.close();
        
        }
        
        System.out.println("p = " + p);
        BufferedWriter s = new BufferedWriter(new FileWriter(new File(p)));
    
        for (Map.Entry<Integer, List<Integer>> pair: map.entrySet()) {
            for (int index = 0; index < pair.getValue().size(); index++) {
                s.write(pair.getValue().get(index));
            }
        }
        
        s.close();
     
    }
}
