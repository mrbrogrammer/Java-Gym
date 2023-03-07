package en.codegym.task.pro.task05.task0509;

/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = j * i;
            }
        }
    
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                
                System.out.print(MULTIPLICATION_TABLE[i][j] +" ");
            }
            System.out.println();
        }
    }
}
