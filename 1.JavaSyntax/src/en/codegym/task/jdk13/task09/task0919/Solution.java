package en.codegym.task.jdk13.task09.task0919;

/* 
Dividing by zero
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void divideByZero() {
        System.out.println(5 / 0);
    }
}
