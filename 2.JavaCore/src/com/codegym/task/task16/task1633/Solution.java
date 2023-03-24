package com.codegym.task.task16.task1633;

import static java.lang.Thread.sleep;

/**
 * Debug everything under the sun
 */
public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) throws InterruptedException {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Thread 1");
        Thread threadB = new Thread(commonThread, "Thread 2");
        
        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setDefaultUncaughtExceptionHandler(handler);
            start();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
