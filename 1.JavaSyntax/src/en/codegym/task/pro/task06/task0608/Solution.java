package en.codegym.task.pro.task06.task0608;

/* 
A cube calculator
*/

public class Solution {
    public static void main(String[] args) {
    }

    //write your code here
    public static long cube(long number){
        int result = 1, exponent = 3;
        
        for (; exponent > 0; exponent--) {
            result *= number;
        }
        return result;
    }
}
