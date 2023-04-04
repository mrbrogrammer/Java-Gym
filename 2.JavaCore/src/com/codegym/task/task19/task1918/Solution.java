package com.codegym.task.task19.task1918;

/* 
Introducing tags

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
        BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String text = "";
        while (br.ready()) {
            text += br.readLine();
        }
        br.close();
    
        String startTag = "<" + args[0];
        String closeTag = "</" + args[0] + ">";
        List<String> list = new ArrayList<>();
        for (String s : text.split("(?=" + startTag + ")|(?<=" + closeTag + ")")) {
            if (s.startsWith(startTag) || s.endsWith(closeTag))
                list.add(s);
        }
        
        int i = 0;
        while (i < list.size()) {
            String res = list.get(i);
            int nStart = 0;
            int nClose = 0;
            nStart = res.contains(startTag) ? ++nStart : nStart;
            nClose = res.contains(closeTag) ? ++nClose : nClose;
            if (nStart == nClose) {
                System.out.println(res);
                i++;
            } else {
                int j = 0;
                while (nStart > nClose) {
                    j++;
                    res += list.get(i + j);
                    nStart = list.get(i + j).contains(startTag) ? ++nStart : nStart;
                    nClose = list.get(i + j).contains(closeTag) ? ++nClose : nClose;
                    
                }
                if (nStart == nClose) {
                    System.out.println(res);
                    
                }
    
                i+=1;
            }
        }
    
    }
}
