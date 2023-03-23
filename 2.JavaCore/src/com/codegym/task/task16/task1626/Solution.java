package com.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new CountdownRunnable(), "Decrease");
        Thread t = new Thread(new CountUpRunnable(), "Increase");
        t1.start();
        t1.join();
        t.start();
        t.join();
    }
    
    public static class CountUpRunnable implements Runnable {
        private int countUpIndex = Solution.number;
        
        @Override
        public void run() {
            try {
                countUpIndex = countUpIndex - (countUpIndex - 1);
                while (true) {
                    Thread.sleep(500);
                    System.out.println(toString());
                    countUpIndex += 1;
                    if (countUpIndex > Solution.number) return;
                }
            } catch (InterruptedException e) {
            }
        }
        
        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}
