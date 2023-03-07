package en.codegym.task.pro.task06.task0605;

/* 
Correct order
Let's write a utility for working with arrays. The main functionality is ready: the printArray() method displays all the elements of the array on the console.
What is left for you is just a trifle: implement the reverseArray() method. It should reverse the order of the elements in the array.
The method should only work with arrays of integer values (int[]).
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        
        //write your code here
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = array.length-1, count = 0; i >= 0; i--) {
            
            array[count] = newArray[i];
            count++;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
