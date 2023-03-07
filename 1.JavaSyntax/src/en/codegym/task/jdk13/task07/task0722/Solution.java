package en.codegym.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        String word;
        while (true) {
            word = reader.readLine();
            if (word.equals("end")) break;
            
            strings.add(word);
        }
        
        strings.forEach(System.out::println);
    }
}