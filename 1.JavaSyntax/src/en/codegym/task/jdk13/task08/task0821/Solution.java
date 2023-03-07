package en.codegym.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();
    
        map.put("Simphiwe", "Madi");
        map.put("Kevin", "Mntambo");
        map.put("Tim", "Lee");
        map.put("Tim", "Ferris");
        map.put("Sam", "Smith");
        map.put("Kate", "Chapel");
        map.put("Josh", "Jennings");
        map.put("Liam", "Jennings");
        map.put("Tyler", "Hero");
        map.put("Beth", "Rico");
        
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
