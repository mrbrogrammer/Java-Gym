package en.codegym.task.jdk13.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int index = 0; index < 10; index++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Display result
        result.forEach(System.out::println);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        final int lengthOfList = list.size();
        
        for (int index = 0; index < lengthOfList * 2; index++) {
            if (index % 2 == 0){
                list.add(index, list.get(index));
            }
        }
        return list;
    }
}
