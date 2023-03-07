package en.codegym.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Words in reverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int index = 0; index < 5; index++) {
            words.add(reader.readLine());
        }
        words.remove(2);
        for (int index = words.size() -1; index >= 0; index--) {
            System.out.println(words.get(index));
        }
    }
}
