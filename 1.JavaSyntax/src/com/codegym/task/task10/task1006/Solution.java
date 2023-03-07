package com.codegym.task.task10.task1006;

/**
Task No. 6 about integer type conversions

1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain a char variable c.
4. The main() method must contain a short variable s.
5. The main() method must contain an int variable i.
6. The main() method must contain a float variable f.
7. The main() method must contain a double variable d.
8. The main() method must contain a double variable result.
9. Don't change the initial value of the variables during initialization. You can only change the cast operators.
10. The program should display "result: 1000.0"
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (int) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        int character = c;
        System.out.println(character);
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}