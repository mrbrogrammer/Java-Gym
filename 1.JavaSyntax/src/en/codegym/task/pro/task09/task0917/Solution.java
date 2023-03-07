package en.codegym.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("CodeGym");
        String second = new String("CodeGym");
        String third = new String("codegym");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //write your code here
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) == second.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
