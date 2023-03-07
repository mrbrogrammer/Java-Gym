package en.codegym.task.pro.task09.task0918;

/* 
Let's work with StringBuilder
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //write your code here
        StringBuilder result = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
        }
        return result;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //write your code here
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);
        return result;
    }
}
