package com.codegym.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        // Start here
        SimpleDateFormat parseFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int index = 1; index < args.length; index += 3) {
    
                        List<String> list = Arrays.asList(args).subList(index, index + 3);
                        Date dob = Date.from(parseFormat.parse(list.get(2)).toInstant());
                        if (list.get(1).contains("f")) {
                            allPeople.add(Person.createFemale(list.get(0), dob));
                        } else {
                            allPeople.add(Person.createMale(list.get(0), dob));
                        }
        
                        System.out.println(allPeople.size() - 1);
        
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int index = 1; index < args.length; index += 4) {
        
                        List<String> list = Arrays.asList(args).subList(index, index + 4);
    
                        Person somebody = allPeople.get(Integer.parseInt(list.get(0)));
                        somebody.setName(list.get(1));
                        somebody.setSex(list.get(2).contains("m") ? Sex.MALE : Sex.FEMALE);
                        
                        Date setDob = Date.from(parseFormat.parse(list.get(3)).toInstant());
                        somebody.setBirthDate(setDob);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int index = 1; index < args.length; index++) {
                        allPeople.set(Integer.parseInt(args[index]), new Person());
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int index = 1; index < args.length; index++) {
                        Person personInfo = allPeople.get(Integer.parseInt(args[index]));
    
                        System.out.println(personInfo.getName() + " " + personInfo.getSex().name().toLowerCase().charAt(0) + " " + dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                    }
                    break;
                }
        }
    }
}
