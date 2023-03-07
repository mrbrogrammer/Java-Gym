package en.codegym.task.jdk13.task09.task0931;

/* 
Deleting spaces
*/

public class Solution {
    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Good afternoon! How's life?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        //write your code here
        return String.join("", string.split(" "));
    }
}
