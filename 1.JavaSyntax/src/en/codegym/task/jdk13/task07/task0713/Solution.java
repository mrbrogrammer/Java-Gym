package en.codegym.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* 
Three arrays
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int index = 0; index < 20; index++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        
        for (int number :
                numbers) {
                if (number % 3 != 0 && number % 2 != 0) others.add(number);
                if (number % 3 == 0) divBy3.add(number);
                if (number % 2 == 0) divBy2.add(number);
                
        }
        
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //write your code here
        for (int value :
                list) {
            System.out.println(value);
        }
    }
}
