package en.codegym.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
The largest number

Read 5 numbers from the keyboard and add them to the integers list.
Find the maximum number in the list.
Display the found number on the screen.
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        //read 5 numbers from the keyboard
        for (int index = 0; index < 5; index++) {
            //add numbers to the integers list
            integers.add(Integer.parseInt(reader.readLine()));
        }
        
        //find the maximum number in the list
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(i) < integers.get(j)){
                    int tmp = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, tmp);
                }
            }
        }
        
        System.out.println(integers.get(integers.size() -1));
    }
}
