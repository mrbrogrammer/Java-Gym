package com.codegym.task.task31.task3101;

/* 
Iterating through a file tree

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        String path = args[0];
        String resultFileAbsolutePath = args[1];
        
        File dir = new File(path);
        File file = new File(resultFileAbsolutePath);
        
        File fuk = new File(file.getParent()+ "\\allFilesContent.txt");
        FileUtils.renameFile(file, fuk);
        
        FileOutputStream fileOutputStream = new FileOutputStream(fuk);
        
        
//        File[] listFiles = dir.listFiles();
        ArrayList<File> tabFile = new ArrayList<File>();
    
        RecursiveDirectory(new File(path), tabFile);
        
        List<File> list = writeFile(tabFile);
        
        for(File file1 : list){
            FileInputStream fileInputStream = new FileInputStream(file1);
            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileOutputStream.write(10);
            fileInputStream.close();
        }
        
        
        fileOutputStream.close();
        
    }
    
    public static List<File> writeFile(ArrayList<File> files) throws IOException {
        
        List<File> list = new ArrayList<>();
        long l = 51;
        
        if(files != null) {
            for (File file1 : files) {
                if (!file1.isDirectory()) {
                    Path path1 = Paths.get(file1.getPath());
                    long bytes = Files.size(path1);
                    if (bytes < l) {
                        list.add(file1);
                    }
                } else {
                    ArrayList<File> x = new ArrayList<>(Arrays.asList(file1.listFiles()));
                    writeFile(x);
                }
            }
        }
        return list;
    }
    
    static void RecursiveDirectory (File directory,ArrayList<File> tabFile) {;
        for (File file: directory.listFiles()) {
            if (file.isFile()) {
                if (file.length() <= 50) {
                    tabFile.add(file);
                }
            }
            else {
                RecursiveDirectory (file, tabFile);
            }
        }
    }
}
