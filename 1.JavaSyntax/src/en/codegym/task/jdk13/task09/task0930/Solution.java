package en.codegym.task.jdk13.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Task about algorithms
*/

public class Solution {

    public static ArraySorter arraySorter = new ArraySorter();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        arraySorter.sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }
}
