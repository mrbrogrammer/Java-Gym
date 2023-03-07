package en.codegym.task.jdk13.task09.task0912;

/* 
Exception when working with numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }

        //write your code here
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
