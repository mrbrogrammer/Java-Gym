package en.codegym.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
Expressing ourselves more concisely

Create a list of strings.
Read 5 strings from the keyboard and add them to the list.
Using a loop, find the shortest string in the list.
Display the string.
If there is more than one, display each on a new line.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int index = 0; index < 5; index++) {
            strings.add(reader.readLine());
        }
        
        int[] lenOfStrings = new int[5];
    
        //find the shortest string in the list
        for (int index = 0; index < strings.size(); index++) {
           lenOfStrings[index] = strings.get(index).length();
        }
    
        Arrays.sort(lenOfStrings);
        
        int maxStringLength = lenOfStrings[0];
    
        for (String value :
                strings) {
            //If there is more than one short strings, display each on a new line.
            if (value.length() == maxStringLength){
                System.out.println(value);
            }
        }
    }
}
