package en.codegym.task.jdk13.task09.task0907;

/* 
Exception when working with numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            int a = 42 / 0;
        }
        //write your code here
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
