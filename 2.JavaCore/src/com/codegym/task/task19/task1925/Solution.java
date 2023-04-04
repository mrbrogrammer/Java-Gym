package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        List<String> words = new ArrayList<>();
        for (int index = 0; index < list.size(); index++) {
            String[] strings = list.get(index).split(" ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > 6) {
                    words.add(strings[i]);
                }
            }
        }
    
        for (int i = 0; i < words.size(); i++) {
            if (i == 0) {
                outStream.write(words.get(i));
//                System.out.print(words.get(i));
            } else {
                outStream.write("," + words.get(i));
//                System.out.print("," + words.get(i));
            }
            
        }
        outStream.close();
    }
}
