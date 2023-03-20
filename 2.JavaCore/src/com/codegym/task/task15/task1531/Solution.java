package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    
    public static String factorial(int n) {
    
        BigInteger f = BigInteger.ONE;
    
        if (n < 0) {
            return String.valueOf(0);
        } else {
            for (int index = 1; index <= n; index++) {
                f = f.multiply(BigInteger.valueOf(index));
            }
            return String.valueOf(f);
        }
    }
}
