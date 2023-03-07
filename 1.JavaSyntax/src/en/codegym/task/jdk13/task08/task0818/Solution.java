package en.codegym.task.jdk13.task08.task0818;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //write your code here
        Map<String, Integer> map = new HashMap<>();
    
        map.put("George", 300);
        map.put("Simon", 1100);
        map.put("Robert", 1200);
        map.put("John", 600);
        map.put("Peter", 500);
        map.put("James", 600);
        map.put("Ellie", 400);
        map.put("Diego", 4000);
        map.put("Rodrigo", 2800);
        map.put("Kith", 900);
    
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //write your code here
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}