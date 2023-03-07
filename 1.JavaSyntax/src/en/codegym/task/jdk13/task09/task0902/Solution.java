package en.codegym.task.jdk13.task09.task0902;

/* 
Stack trace revisited
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        
        return elements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    
        return elements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    
        return elements[2].getMethodName();
    }

    public static String method5() {
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    
        return elements[2].getMethodName();
    }
}
