package com.codegym.task.task15.task1516;

/* 
Default values

*/

import java.util.Arrays;
import java.util.Collection;

public class Solution {

    public int intVar = 2;
    public double doubleVar = 23.0;
    public Double DoubleVar = new Double(12.0);
    public boolean booleanVar = false;
    public Object ObjectVar = true;
    public Exception ExceptionVar = new ArithmeticException();
    public String StringVar = "String";
    
    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);
    }
}
