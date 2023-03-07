package en.codegym.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Creating a two-dimensional array

Reads from the console a number R — the number of rows in the array. The number must be greater than 0.
Then it reads R numbers from the console (any numbers greater than 0).
Then it initializes the two-dimensional multiArray array using:
the number of rows R;
row arrays whose size corresponds to the numbers entered in step 2 (in the order they are entered).
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(buffer.readLine());
        multiArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int columns = Integer.parseInt(buffer.readLine());
            multiArray[i] = new int[columns];
            for (int j = 0; j < multiArray[i].length; j++) {
//                multiArray[i][j] = Integer.valueOf([]);
            }
        }
    
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] == 0){
                    System.out.print("[]");
                }
            }
            System.out.println();
            
        }
    }
}
