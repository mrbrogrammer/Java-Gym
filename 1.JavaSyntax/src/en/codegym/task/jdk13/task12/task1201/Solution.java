package en.codegym.task.jdk13.task12.task1201;

/* 
From a small bucket to a big one
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getSquare(7)); // 49.0
        System.out.println(getSquare(100_000_001)); // 1.00000002E16
        System.out.println(getSquare(9_000_000_000_000_000_001L)); // 8.1E37
    }

    public static double getSquare(long number) {
        double result = (double) number * number;
        return result;
    }
}
