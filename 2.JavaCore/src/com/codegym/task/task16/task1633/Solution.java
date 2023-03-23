package com.codegym.task.task16.task1633;

/**
 * Debug everything under the sun
 * Figure out what the program does.
 *
 * Read about UncaughtExceptionHandler - it's important.
 *
 * Take another careful look at the program.
 *
 * Figure out why our OurUncaughtExceptionHandler doesn't work (use the debugger).
 *
 * Fix the bug, i.e. everything should work. :)
 *
 * Expected result in no particular order:
 *
 * Thread 1: My exception message
 *
 * Thread 2: My exception message
 *
 *
 * Requirements:
 * 1. The main method should create a thread with the following arguments: commonThread and "Thread 1".
 * 2. The main method should create a thread with the following arguments: commonThread and "Thread 2".
 * 3. The main method must start two threads (Thread objects).
 * 4. The main method must interrupt two threads (Thread objects).
 * 5. The program must use OurUncaughtExceptionHandler's uncaughtException method to display 2 messages.
 * 6. Don't explicitly call OurUncaughtExceptionHandler's uncaughtException method.
 * 7. The program's output should contain the following lines: "Thread 1: My exception message" and "Thread 2: My exception message".
 */
public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
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
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
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
