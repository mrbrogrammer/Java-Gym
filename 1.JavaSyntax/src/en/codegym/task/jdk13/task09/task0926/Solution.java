package en.codegym.task.jdk13.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
List of number arrays
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{1,3,4,5,6});
        arrays.add(new int[]{1,3});
        arrays.add(new int[]{3,4,5,6});
        arrays.add(new int[]{1,3,4,5,6,5,6});
        arrays.add(new int[]{});
        
        return arrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
