package en.codegym.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Array of numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
    
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(buffer.readLine());
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

