package en.codegym.task.jdk13.task02.task0219;

/* 
Print three times
*/

public class Solution {
    public static void print3(String text) {
        //write your code here
        for (int i = 0; i < 3; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
