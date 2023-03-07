package en.codegym.task.jdk13.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
In decreasing order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        
        

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here
        for (int index = 0; index < array.length; index++) {
            for (int counter = 0; counter < array.length; counter++) {
                if (array[index] > array[counter]) {
                    int tmp = array[index];
                    array[index] = array[counter];
                    array[counter] = tmp;
                    
                }
            }
        }
    }
}
