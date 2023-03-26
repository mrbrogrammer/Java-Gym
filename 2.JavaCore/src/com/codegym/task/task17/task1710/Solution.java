package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0 // -c
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1 // -c
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat parseFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                Date dob = Date.from(parseFormat.parse(args[3]).toInstant());
                
                if (args[2].contains("f")) {
                    allPeople.add(Person.createFemale(args[1], dob));
                } else {
                    allPeople.add(Person.createMale(args[1], dob));
                }
                
                System.out.println(allPeople.size() - 1);
    
                break;
            case "-u":
                
                Person somebody = allPeople.get(Integer.parseInt(args[1]));
    
                somebody.setSex(args[2].contains("m") ? Sex.MALE : Sex.FEMALE);
                somebody.setName(args[2]);
                Date setDob = Date.from(parseFormat.parse(args[4]).toInstant());
                somebody.setBirthDate(setDob);
                break;
            case "-d":
                allPeople.set(Integer.parseInt(args[1]), new Person());
                break;
            case "-i":
                Person personInfo = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(personInfo.getName() + " " + personInfo.getSex().name().toLowerCase().charAt(0) + " " + dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                break;
        }
    }
}
