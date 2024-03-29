package com.codegym.task.task16.task1619;

/* 
No interrupt, no dice?


No interrupt, no dice?
Figure out how the program works.
Make it so that the ourInterrupt method allows the TestThread to terminate itself.
Don't use the interrupt method.


Requirements:
1. The Solution class must have a public static method called ourInterrupt with no parameters.
2. The run method should display "he-he" every half second until the ourInterrupt method is called.
3. You must change the condition of the while loop in the run method.
4. The main method must create a Thread object by passing a TestThread object to the constructor.
5. The main method must call the start method on the Thread object.
6. The main method must call the ourInterrupt method.
*/

import java.io.StringReader;

public class Solution {
    public static boolean isCancel = false;
    
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        isCancel = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
