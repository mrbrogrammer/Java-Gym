package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inStream = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
    
        List<String> lines = new ArrayList<>();
        while (inStream.ready()) {
            lines.add(inStream.readLine());
        }
        inStream.close();
    
        for (int index = 0; index < lines.size(); index++) {
            String string = lines.get(index);
            for (int i = string.length() - 1; i >= 0; i--) {
                System.out.print(string.charAt(i));
            }
            System.out.println();
            
        }
    }
}
