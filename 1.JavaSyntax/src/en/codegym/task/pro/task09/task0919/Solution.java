package en.codegym.task.pro.task09.task0919;

/* 
Flipping strings
*/

public class Solution {
    public static void main(String[] args) {
        String string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //write your code here
        String result = new StringBuilder(string).reverse().toString();
        return result;
    }
}
