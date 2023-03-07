package en.codegym.task.jdk13.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("rose");
        strings.add("lyra");
        strings.add("love");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //write your code here
        
        for (int index = 0; index < 3; index++) {
            if (strings.get(index).contains("l") && strings.get(index).contains("r")) {
                continue;
            }
            if (strings.get(index).contains("l")) {
                strings.add(strings.get(index));
            }
        }
        
        strings.removeIf(x-> x.contains("r") && !(x.contains("l")));

        return strings;
    }
}