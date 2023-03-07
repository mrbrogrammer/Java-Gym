package en.codegym.task.jdk13.task07.task0707;

import java.util.ArrayList;

/**
5 different strings in a list
1. The ArrayList<String> list field must be initialized in the main method.
2. The program should add any 5 strings to the list.
3. The program should display the size of the list on the screen.
4. The program should display the contents of the list, each value on a new line.
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        //write your code here
    
        list = new ArrayList<>();
        //add any 5 strings to the list.
        list.add("Nike");
        list.add("Adidas");
        list.add("Puma");
        list.add("Reebok");
        list.add("Vans");
    
        //The program should display the size of the list on the screen.
        System.out.println(list.size());
    
        //display the contents of the list, each value on a new line
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }
}
