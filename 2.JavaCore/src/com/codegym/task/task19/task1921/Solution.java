package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
    
        List<String> list = new ArrayList<>();
        while (inStream.ready()) {
            String string = inStream.readLine();
            list.add(string);
        }
    
        for (int i = 0; i < list.size(); i++) {
            // split the string into strings then add to list
            String[] strings = list.get(i).split(" ");
            String name = "".trim();
            String date = "".trim();
            for (int j = 0; j < strings.length; j++) {
                try {
                     int num = Integer.parseInt(strings[j]);
                     date += num + " ";
                } catch (Exception e) {
                    name += strings[j] + " ";
                }
            }
            
            String[] dateNumber = date.split(" ");
            PEOPLE.add(new Person(name.trim(), new Date(Integer.parseInt(dateNumber[2]) - 1900 , Integer.parseInt(dateNumber[0]) -1, Integer.parseInt(dateNumber[1]))));

        }
    
        
        
        
        for (int index = 0; index < PEOPLE.size(); index++) {
            System.out.print(PEOPLE.get(index).getName());
            System.out.println(PEOPLE.get(index).getBirthDate());
        }
        
        inStream.close();
    }
}
