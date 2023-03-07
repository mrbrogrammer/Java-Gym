package en.codegym.task.jdk13.task02.task0216;

/* 
Minimum of three numbers
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < b || c < a) {
            return c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 2));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(2, 1, 3));
        System.out.println(min(5, 5, 10));
    }
}
