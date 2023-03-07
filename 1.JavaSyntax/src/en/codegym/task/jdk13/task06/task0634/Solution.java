package en.codegym.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Chess board
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int dimensions = Integer.parseInt(buffer.readLine());
        array = new char[dimensions][dimensions];
    
        for (int i = 1; i <= dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    
                    array[i-1][j] = '#';
                } else if (i % 2 == 0 && j % 2 != 0){
                    array[i-1][j] = '#';
                } else {
                    array[i-1][j] = ' ';
                }
            }
            
        }
    
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        
    }
}
