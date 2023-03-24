package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Take your turn!
 */
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        
        t1.printResult();
        t2.printResult();
    }

    //write your code here
    public static class Read3Strings extends Thread{
        List<String> letters = new ArrayList<>();
        @Override
        public void run() {
            for (int index = 0; index < 3; index++) {
                try {
                   letters.add(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    
        public void printResult() {
            for (int index = 0; index < letters.size(); index++) {
                System.out.print(letters.get(index) + " ");
            }
            System.out.println();
        }
    }
}
