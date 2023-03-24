package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clew
 * 1. Create 5 different threads that differ from Thread:
 * 1.1. Thread 1 must run indefinitely;
 * 1.2. Thread 2 should display "InterruptedException" when an InterruptedException occurs;
 * 1.3. Thread 3 should display "Hurray" every half second";
 * 1.4. Thread 4 must implement the Message interface. When the showWarning method is called, the thread should stop;
 * 1.5. Thread 5 should read numbers from the console until "N" is entered. Then it should display the sum of the entered numbers.
 * 2. In a static block, add your threads to List<Thread> threads in the specified order.
 * 3. The threads should not start automatically.
 *
 * Hint:
 * Thread 4 can be checked using isAlive()
 *
 *
 * Requirements:
 * 1. The Solution class's static block must create 5 threads and add them to the threads list.
 * 2. The threads in the threads list should not start automatically.
 * 3. Thread 1 in the threads list must run infinitely.
 * 4. Thread 2 in the threads list should display "InterruptedException" when an InterruptedException occurs.
 * 5. Thread 3 in the threads list should display "Hurray" every half second.
 * 6. Thread 4 in the threads list must implement the Message interface. When the showWarning method is called, the thread should stop.
 * 7. Thread 5 in the threads list should read numbers from the console until "N" is entered. Then it should display the sum of the entered numbers.
 */

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
    
        threads.get(0).start();
        Thread2 t2 = (Thread2) threads.get(1);
        t2.start();
        threads.get(2).start();
        Thread4 t1 = (Thread4) threads.get(3);
        t1.start();
        threads.get(4).start();
        
        t2.interrupt();
        t2.interrupt();
        System.out.println(Thread.currentThread().isInterrupted());
        t1.showWarning();
        
        
        
    }
    
    public static class Thread1 extends Thread {
    
        @Override
        public void run() {
            while (true){
            }
        }
    }
    
    public static class Thread2 extends Thread {
        
        @Override
        public void run() {
            try {
                if (this.isInterrupted())
                    throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    
    public static class Thread3 extends Thread {
        
        @Override
        public void run() {
            while (isAlive()) {
                try {
                    Thread.sleep(500);
                    System.out.println("Hooray!");
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
    
    public static class Thread4 extends Thread implements Message {
        
        private boolean isStopped = false;
        
        @Override
        public void run() {
            while (!isStopped) {
            }
            showWarning();
        }
    
        @Override
        public void showWarning() {
            isStopped = true;
        }
    }
    
    public static class Thread5 extends Thread {
        
        @Override
        public void run() {
        }
    }
}