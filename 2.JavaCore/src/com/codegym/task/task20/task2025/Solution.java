package com.codegym.task.task20.task2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Number algorithms

*/

public class Solution {
    private static int N;
    private static int[] digitsMultiSet;
    private static int[] testMultiSet;
    private static List<Long> results;
    private static long maxPow;
    private static long minPow;
    private static long[][] pows;
    
    private static void genPows(int N) {
//        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }
    
    private static boolean check(long pow) {
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;
        
        for (int i = 0; i < 10; i++) {
            testMultiSet[i] = 0;
        }
        
        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            if (testMultiSet[i] > digitsMultiSet[i]) return false;
            pow = pow / 10;
        }
        
        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }
        
        return true;
    }
    
    private static void search(int digit, int unused, long pow) {
        if (pow >= maxPow) return;
        
        if (digit == -1) {
            if (check(pow)) results.add(pow);
            return;
        }
        
        if (digit == 0) {
            digitsMultiSet[digit] = unused;
            search(digit - 1, 0, pow + unused * pows[digit][N]);
        } else {
            // Check if we can generate more than minimum
            if (pow + unused * pows[digit][N] < minPow) return;
            
            long p = pow;
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit - 1, unused - i, p);
                if (i != unused) {
                    p += pows[digit][N];
                    // Check maximum and break the loop - doesn't help
                    // if (p >= maxPow) break;
                }
            }
        }
    }
    
    public static List<Long> generate(int maxN) {
//        if (maxN > 20) throw new IllegalArgumentException();
        
        genPows(maxN);
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        testMultiSet = new int[10];
        
        for (N = 1; N <= maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);
            
            search(9, N, 0);
        }
        
        Collections.sort(results);
        
        return results;
    }

    public static long[] getNumbers(long N) {
        
        int len = String.valueOf(N).length();
    
    
        List<Long> g = generate(len);
        long[] result = new long[g.size()];
        int index = 0;
        for (; index < g.size(); index++) {
            if (g.get(index) >= N) {
                break;
            }
            result[index] = g.get(index);
        }
        
        result = Arrays.copyOf(result, index);
        return result;
    }

    public static void main(String[] args) throws IOException {
        long[] ns = new long[]{8208L, 370L};
    
        for (int i = 0; i < ns.length; i++) {
            long N = ns[i];
            System.out.println("Result for N = " + N);
            System.out.println(Arrays.toString(Solution.getNumbers(N)));
        }
        
//        long a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1000000L)));
//        long b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
//
//        a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1000L)));
//        b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
    }
}
