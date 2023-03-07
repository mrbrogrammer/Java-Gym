package en.codegym.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        //create an array of 20 numbers.
        int[] totalNumbers = new int[20];
    
        //Populate it with values from the keyboard.
        for (int i = 0; i < totalNumbers.length; i++) {
            totalNumbers[i] = Integer.parseInt(buffer.readLine());
        }
    
        //Create two arrays of 10 numbers each.
        int[] firstHalfOfTotalNumbers = new int[10];
        int[] secondHalfOfTotalNumbers = new int[10];
        
        for (int i = 0, counter = 0; i < totalNumbers.length; i++) {
            if (i >= 10) {
                secondHalfOfTotalNumbers[counter] = totalNumbers[i];
                counter++;
            } else {
                firstHalfOfTotalNumbers[i] = totalNumbers[i];
            }
        }

        for (int i = 0; i < firstHalfOfTotalNumbers.length; i++) {
            System.out.println(secondHalfOfTotalNumbers[i]);
        }
    }
}
