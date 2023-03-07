package en.codegym.task.jdk13.task09.task0906;

/* 
Logging stack traces
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //write your code here
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String methodName = elements[2].getMethodName();
        String fileName = elements[2].getFileName();
        
        System.out.printf("%s: %s: %s", fileName, methodName, text);
    }
}
