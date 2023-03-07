package en.codegym.task.jdk13.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> strings = new ArrayList<>();
    
        for (int index = 0; index < 10; index++) {
            strings.add(Integer.parseInt(reader.readLine()));
        }
    
        for (int index = strings.size() - 1; index >= 0; index--) {
            System.out.println(strings.get(index));
        }
    }
}
