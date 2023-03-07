package en.codegym.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //write your code here
        
        StringTokenizer values = new StringTokenizer(query, delimiter);
        String[] result = new String[values.countTokens()];
        int counter = 0;
        while (values.hasMoreTokens()){
            String value = values.nextToken();
            Arrays.fill(result,counter,counter+1, value);
            counter++;
        }
        return result;
    }
}
