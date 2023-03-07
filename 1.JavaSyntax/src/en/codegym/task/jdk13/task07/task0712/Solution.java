package en.codegym.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
Minimum or maximum

Initialize the strings field in the main method.
Add 10 strings from the keyboard to the strings list.
Determine whether the shortest string or the longest string is encountered first in the list. If several strings are shortest or longest, then consider the very first such string encountered.
Display the string described in Step 3. One string should be displayed.
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //write your code here
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int index = 0; index < 10; index++) {
            strings.add(reader.readLine());
        }
    
        int[] lenOfStrings = new int[10];
        for (int i = 0; i < strings.size(); i++) {
            lenOfStrings[i] = strings.get(i).length();
        }
    
        Arrays.sort(lenOfStrings);
    
        for (String value :
                strings) {
            if (value.length() == lenOfStrings[0] || value.length() == lenOfStrings[lenOfStrings.length - 1]){
                System.out.println(value);
                break;
            }
        }
    }
}
