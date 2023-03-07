package en.codegym.task.jdk13.task06.task0612;

import java.text.DecimalFormat;

/**
Calculator
1. The plus method must return the sum of a and b.
2. The minus method must return the difference between a and b.
3. The multiply method must return the product of a and b.
4. The divide method must return the result of dividing a by b.
5. The percent method must return b percent of the number a.
*/

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        return a + b;
    }

    public static int minus(int a, int b) {
        //write your code here
        return a - b;
    }

    public static int multiply(int a, int b) {
        //write your code here
        return a * b;
    }

    public static double divide(int a, int b) {
        //write your code here
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //write your code here
        DecimalFormat result = new DecimalFormat("#.##");
        return Double.parseDouble(result.format( (double)  b / 100 * a));
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 50));
    }
}