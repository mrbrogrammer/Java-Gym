package com.codegym.task.task31.task3101;

/* 
Iterating through a file tree

*/
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        File folder = new File(args[0]);
        
        
        
//        List<File> filesWithSizeLessThan50 = Arrays.stream(Objects.requireNonNull(folder.listFiles()))
//                .filter(x -> (byte) x.length() < 50)
//                .sorted(Comparator.comparing(File::getName))
//                .collect(Collectors.toList());
    
        List<File> filesWithSizeLessThan50 = new ArrayList<>();
        for (File file : folder.listFiles()) {
            if (file.getTotalSpace() < 50) {
                filesWithSizeLessThan50.add(file);
            }
        }
        
        // getting the correct file by checking whether the list contains it, then rename the file to a different name.
//        List<File> fileWithSpecialName = filesWithSizeLessThan50.stream()
//                .filter(x -> x.getName().equals(args[1]))
//                .filter(FileUtils::isExist).collect(Collectors.toList());
    
        List<File> fileWithSpecialName = new ArrayList<>();
        for (File file : filesWithSizeLessThan50) {
            if (file.getName().equals(args[1])) fileWithSpecialName.add(file);
        }
                
//        List<File> result = filesWithSizeLessThan50.stream()
//                .filter(x -> !x.getName().equals(args[1]))
//                .collect(Collectors.toList());
    
        List<File> result = new ArrayList<>();
        for (File file : filesWithSizeLessThan50) {
            if (!file.getName().equals(args[1])) result.add(file);
        }
    
        try {
            FileUtils.renameFile(fileWithSpecialName.get(0), new File("allFilesContent.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        StringBuilder string = new StringBuilder();
        for (File file : result) {
            
            FileInputStream inStream = null;
            try {
                inStream = new FileInputStream(file);
                while (inStream.available() > 0) {
                    char c = (char) inStream.read();
                    string.append(c);
                    
                }
                string.append('\n');

                inStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        
        FileOutputStream outStream;
        
        File f = new File(args[0] + "allFilesContent.txt");
        outStream = new FileOutputStream(f.getAbsolutePath());
    
        outStream.write(string.toString().getBytes());
        
        outStream.close();
        
    }
}
