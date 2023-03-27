package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader inStream = null;
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            List<BufferedReader> inStreams = new ArrayList<>(2);
            for (int index = 0; index < 2; index++) {
                inStream = new BufferedReader(new FileReader(reader.readLine()));
                inStreams.add(inStream);
            }
            
            BufferedReader firstInStream =  inStreams.get(0);
            while (firstInStream.ready()) {
                String c = firstInStream.readLine();
                
                if (c != null) {
                    allLines.add(c);
                }
            }
            
            
//            System.out.println(allLines);
    
            BufferedReader secondInStream =  inStreams.get(1);
            while (secondInStream.ready()) {
                String s = secondInStream.readLine();
                if (s != null) {
                    linesForRemoval.add(s);
                }
            }
        } catch (Exception e) {
        
        }
        
        Solution s = new Solution();
        s.joinData();
        
    }

    public void joinData() throws CorruptedDataException {
        List<String> stringsToRemove = new ArrayList<>(allLines);
        
        

        if (!allLines.containsAll(linesForRemoval)) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            for (int index = 0; index < stringsToRemove.size(); index++) {
                for (int indexJ = 0; indexJ < linesForRemoval.size(); indexJ++) {
                    if (stringsToRemove.get(index).equals(linesForRemoval.get(indexJ))) {
                        allLines.remove(index - indexJ);
                    }
                }
            }
        }
    }
}

///Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task17/task1721/data1.txt

///Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task17/task1721/data2.txt
