package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

OOP: Method overloading
Overload the printMatrix method in 8 different ways. You should end up with 10 different printMatrix methods.


Requirements:
1. The Solution class must implement 10 printMatrix methods with different parameters.
2. The Solution class must be public.
3. All of the Solution class's methods must be static.
4. All of the Solution class's methods must be public.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    
    public static void printMatrix(short m, short n, String value) {
        System.out.println("Filling with String objects");
        printMatrix( m, (int) n, value);
    }
    
    public static void printMatrix(short m, short n, Object value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (String) value);
    }
    
    public static void printMatrix(long m, long n, Object value) {
        System.out.println("Filling with String objects");
        printMatrix((short) m, (short) n, value);
    }
    
    public static void printMatrix(int m, short n, Object value) {
        System.out.println("Filling with String objects");
        printMatrix((long) m, n, value);
    }
    
    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("Filling with String objects");
        printMatrix((int) m, (int) n, value);
    }
    
    public static void printMatrix(Integer m, Integer n, Object value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (String) value);
    }
    
    public static void printMatrix(Integer m, short n, Object value) {
        System.out.println("Filling with String objects");
        printMatrix((int) m, n, value);
    }
    
    public static void printMatrix(int m, short n, String value) {
        System.out.println("Filling with String objects");
        printMatrix((Integer) m, n, (Object) value);
    }
}
