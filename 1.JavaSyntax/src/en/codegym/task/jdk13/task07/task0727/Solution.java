package en.codegym.task.jdk13.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
You need to replace the program's functionality
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }
    
        for (int index = 0; index < strings.size(); index++) {
            if (strings.get(index).length() % 2 == 0) {
                strings.set(index, strings.get(index) + " " + strings.get(index));
            } else {
                strings.set(index, strings.get(index) + " " + strings.get(index) + " " + strings.get(index));
            }
    
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (String string : strings) {
            resultStrings.add(string.toUpperCase());
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
