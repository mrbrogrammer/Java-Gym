package com.codegym.task.task16.task1628;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    //new ByteArrayInputStream("3\ntest 1\ntest 2\ntest 3\n".getBytes())));
    
    public static void main(String[] args) throws IOException {
        // Read string count
        int count = Integer.parseInt(reader.readLine());

        // Init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            //write your code here
            String word;
            while (!isInterrupted()) {
                try {
                    word = reader.readLine();
                    if (word != null) {
                        result.add(word);
                        readStringCount.getAndIncrement();
                    }
                } catch (IOException e) {
                }
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
