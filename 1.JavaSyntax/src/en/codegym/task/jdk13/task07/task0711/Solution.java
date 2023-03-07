package en.codegym.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
Remove and insert

Create a list of strings.
Add 5 strings from the keyboard.
Do the following 13 times: remove the last string and insert it at the beginning.
Use a loop to display the resulting list, each value on a new line.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int index = 0; index < 5; index++) {
            strings.add(reader.readLine());
        }
    
        //remove the last string and insert it at the beginning
        for (int index = 0; index < 13; index++) {
            strings.add(0, strings.get(strings.size() -1));
            strings.remove(strings.size() - 1);
        }
    
        for (String value :
                strings) {
            System.out.println(value);
        }
    }
}
