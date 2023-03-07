package en.codegym.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Maximum and minimum numbers in an array
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
    
        int[] array = new int[20];
        for (int index = 0; index < array.length; index++) {
            array[index] = Integer.parseInt(reader.readLine());
        }
    
        Arrays.sort(array);
        
        maximum = array[array.length-1];
        minimum = array[0];
        
        System.out.print(maximum + " " + minimum);
    }
}
