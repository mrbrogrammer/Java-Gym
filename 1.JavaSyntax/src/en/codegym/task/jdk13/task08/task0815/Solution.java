package en.codegym.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Census
*/

public class Solution {
    public static Map<String, String> createMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        
        map.put("Simphiwe", "Madi");
        map.put("Kevin", "Mntambo");
        map.put("Olwethu", "Madi");
        map.put("Bongani", "Madi");
        map.put("Sam", "Mavuso");
        map.put("Kat", "Modise");
        map.put("Josh", "Jennings");
        map.put("Liam", "Jennings");
        map.put("Tyler", "Hero");
        map.put("Beth", "Madi");
        
        return map;

    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        //write your code here
        int counter = 0;
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            if (pair.getValue().equals(name)) counter++;
        }
        return counter;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        //write your code here
        int counter = 0;
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            if (pair.getKey().equals(lastName)) counter++;
        }
        return counter;

    }

    public static void main(String[] args) {
    }
}
