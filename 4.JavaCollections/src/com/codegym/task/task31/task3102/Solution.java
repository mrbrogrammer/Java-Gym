package com.codegym.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Find all the files

*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File folder = new File(root);
        int count = 0;
        int numberOfDir = 0;
        List<String> result = new ArrayList<>();
    
    
        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.add(folder);
    
        while (!fileQueue.isEmpty()){
        
            File[] arrFile = fileQueue.poll().listFiles();
            if (arrFile != null){
                for (File file : arrFile) {
                    if (file.isDirectory()){
                        fileQueue.add(file);
                    } else {
                        result.add(file.getAbsolutePath());
                    }
                
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        getFileTree("/Users/admin/Downloads/CodeGymTasks/4.JavaCollections/src/com/codegym/task/task31/task3102").forEach(System.out::println);
    }
}
