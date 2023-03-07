package en.codegym.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us
*/

public class Solution {
    public static Set<Integer> createSet() {
        // write your code here
        Set<Integer> set = new HashSet<>();
        for (int index = 0; index < 20; index++) {
            set.add(index + 1);
        }
        
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        set.removeIf(x -> x > 10);
    }

    public static void main(String[] args) {
    }
}
