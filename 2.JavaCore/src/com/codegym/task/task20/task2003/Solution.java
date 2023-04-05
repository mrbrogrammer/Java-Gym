package com.codegym.task.task20.task2003;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Introducing properties

*/

public class Solution {
    
    public static Map<String, String> properties = new HashMap<>();
    
    
    public static void main(String[] args) throws Exception {
    
        Solution s = new Solution();
        s.fillInPropertiesMap();
        
        OutputStream outputStream = new FileOutputStream("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2003/file1.txt");
        
        s.save(outputStream);
        outputStream.close();
    }
    public void fillInPropertiesMap() throws Exception {
        // Implement this method
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(consoleReader.readLine());
        
        load(inputStream);
        
        inputStream.close();
        consoleReader.close();
    }
    
    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
        
        Properties properties = new Properties();
    
        properties.putAll(Solution.properties);
        
        properties.store(outputStream, null);
    }
    
    public void load(InputStream inputStream) throws Exception {
        // Implement this method
        
        Properties properties = new Properties();
        properties.load(inputStream);
        
        Set keys = properties.keySet();
        Iterator iterator = keys.iterator();
        
        String key;
        String value;
        
        while (iterator.hasNext()) {
            key = (String) iterator.next();
            value = properties.getProperty(key);
            Solution.properties.put(key, value);
        }
    }
}
