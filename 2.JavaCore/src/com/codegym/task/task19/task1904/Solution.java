package com.codegym.task.task19.task1904;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        
        PersonScannerAdapter sc = new PersonScannerAdapter(new Scanner(new File("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task19/task1904/in.txt")));
        sc.read();
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;
    
        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }
    
        @Override
        public Person read() throws IOException {
            Person person = null;
            int peopleRead = 0;
            while (peopleRead != 1 && fileScanner.hasNext()) {
                String chars = fileScanner.nextLine();
                String[] data = chars.split(" ");
                person = new Person(data[2], data[0], data[1], new Date(Integer.parseInt(data[data.length-1]) - 1900, Integer.parseInt(data[data.length-3]) -1, Integer.parseInt(data[data.length-2])));
                peopleRead++;
            }
    
            return person;
        }
    
        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
