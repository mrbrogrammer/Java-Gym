package en.codegym.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses


Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
If the number of residents on each side of the street is the same, then output nothing.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        //Create an array of 15 integers.
        int[] numbers = new int[15];
        
        //Populate it with values from the keyboard.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        
        //Find out which side of the street has more people living on it.
        
        
        int countOdd = 0;
        int countEven = 0;
        for (int i = 1; i <= numbers.length; i++) {
            if (i % 2 == 0) {
                countOdd += numbers[i-1];
            } else {
                countEven += numbers[i-1];
            }
        }
        
        if (countOdd > countEven) {
            System.out.println("Odd-numbered houses have more residents.");
        } else if (countOdd < countEven) {
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
