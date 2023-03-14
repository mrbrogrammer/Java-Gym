package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person;
        String key;
        
        do {
            key = reader.readLine();
            switch (key.toLowerCase()) {
                case "user":
                    person = new Person.User();
                    doWork(person); // Call doWork
                    break;
                case "loser":
                    person = new Person.Loser();
                    doWork(person); // Call doWork
                    break;
                case "coder":
                    person = new Person.Coder();
                    doWork(person); // Call doWork
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    doWork(person); // Call doWork
                    break;
            }


        } while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer"));
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else
            ((Person.Programmer) person).enjoy();
    }
}
