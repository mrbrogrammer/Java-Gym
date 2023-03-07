package en.codegym.task.pro.task05.task0519;

import java.util.Arrays;

import static java.util.Arrays.sort;

/* 
Is anyone there?

*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //write your code here
        boolean isFound = false;
        int[] clone = Arrays.copyOf(array, array.length);
        
        Arrays.sort(clone);
    
        
        try {
            if (clone[Arrays.binarySearch(clone, element)] == element) {
                isFound = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
        
        System.out.println(isFound);
    }
}
