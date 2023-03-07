package com.codegym.task.task10.task1014;

/**
Use the fewest number of static modifiers
1. The class must have a variable A.
2. The class must have a variable B.
3. The class must have a variable C.
4. The class must have a variable D.
5. Don't change the main method.
6. Don't change the getA method.

*/

public class Solution {
    public static int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
