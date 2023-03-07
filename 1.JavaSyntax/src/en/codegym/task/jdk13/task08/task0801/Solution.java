package en.codegym.task.jdk13.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set of plants

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Set<String> set = new HashSet<>();
        
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");
    
        for (String value :
                set) {
            System.out.println(value);
        }
    }
}
