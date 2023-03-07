package en.codegym.task.pro.task15.task1502;

import java.util.Scanner;

/* 
Back to basics
*/

public class Solution {
    public static void main(String[] args) {
            Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) scanner.close();
        }
    }
}
