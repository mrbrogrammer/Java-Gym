package en.codegym.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Shuffled just in time
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        
        //Use the keyboard to enter 2 numbers N and M.
        final int N = (Integer.parseInt(reader.readLine()));
        final int M = (Integer.parseInt(reader.readLine()));
        
        for (int index = 0; index < N; index++) {
            strings.add(reader.readLine());
        }
    
        //Move the first M strings to the end of the list.
        for (int index = 0; index < M; index++) {
            strings.add(strings.get(index));
        }
        
        for (int index = 0; index < M; index++) {
            strings.remove(0);
        }
        
        strings.forEach(System.out::println);
    
    }
}
