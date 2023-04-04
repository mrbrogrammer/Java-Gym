package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(args[1]));
    
    
        List<String> list = new ArrayList<>();
        while (inStream.ready()) {
            String string = inStream.readLine();
            list.add(string);
        }
        
        inStream.close();
    
        String result = "";
        for (int index = 0; index < list.size(); index++) {
            String[] strings = list.get(index).split(" ");
            for (int i = 0; i < strings.length; i++) {
                int count = 0;
                for (int j = 0; j < strings[i].length(); j++) {
                    if (String.valueOf(strings[i].charAt(j)).matches("[0-9]")) {
                        count++;
                    }
                }
                
                if (count > 0) {
                    result += " " + strings[i];
                }
            }
        }
        outStream.write(result.trim());
        
        outStream.close();
        
    }
}
