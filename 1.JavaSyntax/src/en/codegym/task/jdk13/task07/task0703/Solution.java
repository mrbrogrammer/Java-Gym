package en.codegym.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
2 arrays
In each element of the number array,
record the length of the string whose string array index coincides with the current
index of the number array. Display the contents of the number array, each value on a new line.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        //Create an array of 10 strings. && Create an array of 10 numbers.
        String[] strings = new String[10];
        int[] numbers = new int[10];
    
        //Enter 10 strings from the keyboard, and put them in an array of strings.
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    
        for (int i = 0; i < strings.length; i++) {
            strings[i] = buffer.readLine();
            numbers[i] = strings[i].length();
        }
    
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
