package en.codegym.task.jdk13.task07.task0715;

import java.util.ArrayList;

/* 
More Sam-I-Am
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        
        ArrayList<String> words = new ArrayList<>();
        
        words.add("Sam");
        words.add("I");
        words.add("Am");
    
        for (int index = 0; index < 3 + 3; index++) {
            if (!(index % 2 == 0))
                words.add(index, "Ham");
        }
        
        words.forEach(System.out::println);
    }
}
