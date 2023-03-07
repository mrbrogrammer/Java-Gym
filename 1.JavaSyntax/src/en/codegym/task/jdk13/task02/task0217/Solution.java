package en.codegym.task.jdk13.task02.task0217;

/* 
Minimum of four numbers
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        int firstHalf = min(a,b);
        int secondHalf = min(c,d);
        
        if (firstHalf < secondHalf) {
            return firstHalf;
        }
        return secondHalf;

    }

    public static int min(int a, int b) {
        //write your code here
        if (a < b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
