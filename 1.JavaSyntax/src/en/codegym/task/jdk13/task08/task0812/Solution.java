package en.codegym.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Longest sequence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
    
        for (int index = 0; index < 10; index++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        /**
        Be sure that you display the length of the unbroken sequence,
        not the total number of numbers that repeat more than any others in the list.
        */
        
        int occurrenceCounter = 0;
        int[] occurrence = new int[10];
        for (int index1 = 0, index2 = 1; index1 < numbers.size(); index1++) {
            if (numbers.get(index1 == 10 ? index1 -1 : index1).equals(numbers.get(index2 == 11 ? index2 - 2 : index2 == 10 ? index2 - 1 : index2))) {
                occurrenceCounter++;
            } else {
                occurrenceCounter++;
                occurrence[index2 == 10 ? index2 - 2 : index2] = occurrenceCounter;
                occurrenceCounter = 0;
            }
            
            if (index1 == numbers.size() - 1) {
                occurrence[index2 == 10 ? index2 - 1 : index2] = occurrenceCounter;
            }
            index2++;
        }
    
        Arrays.sort(occurrence);
        System.out.println(occurrence[occurrence.length -1]);
    }
}
