package en.codegym.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
Checking the order

Read 10 words from the keyboard and add them to a list of strings.
Determine whether the list is ordered by increasing string length.
If it is not, then display the index of the first element that violates this order.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int index = 0; index < 10; index++) {
            strings.add(reader.readLine());
        }
        
        int[] lengthOfStrings = new int[10];
    
        for (int index = 0; index < strings.size(); index++) {
            lengthOfStrings[index] = strings.get(index).length();
        }
     
        for (int index1 = 0, index2 = 1; index1 < lengthOfStrings.length; index1++) {
            if (lengthOfStrings[index1] > lengthOfStrings[index2 == lengthOfStrings.length ? lengthOfStrings.length - 1 : index2] || lengthOfStrings[index1] < lengthOfStrings[(index2 - index1 -1)]) {
                System.out.println(index2);
                break;
            }
            index2++;
        }
    }
}

