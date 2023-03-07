package en.codegym.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
To the top of the list

1. Declare a string list variable and immediately initialize it.
2. The program should read 10 strings from the keyboard and add them to the list.
3. The program should add lines to the beginning of the list.
4. The program should display the list, each value on a new line.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        //read 10 strings from the keyboard and add them to the list
        for (int index = 0; index < 10; index++) {
            list.add(0, reader.readLine());
        }
    
        for (int counter = 0; counter < list.size(); counter++) {
            System.out.println(list.get(counter));
        }
    }
}
