package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();
    
    
    static {
        try {
            FileInputStream inStream = new FileInputStream(Statics.FILE_NAME);
    
            for (; inStream.available() > 0;) {
                char character ;
                String collection = "";
                
                for (; inStream.available() > 0;) {
                    character = (char) inStream.read();
                    if (inStream.available() > 0 && String.valueOf(character).equals("\n")) {
                        break;
                    } else {
                        collection += character;
                    }
                }
                lines.add(collection);
            }
            
            inStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
