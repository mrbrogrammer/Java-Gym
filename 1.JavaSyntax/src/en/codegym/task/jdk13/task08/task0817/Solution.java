package en.codegym.task.jdk13.task08.task0817;

import java.util.*;

/* 
We don't need repeats
*/

public class Solution {
    public static Map<String, String> createMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        
        map.put("Sims", "Madi");
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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            Map.Entry<String, String> name1 = iterator.next();
            for (int j = 0; j < i; j++) {
                name1 = iterator.next();
            }
            
            for (int k = 0; k < map.size() - (1 + i); k++) {
                Map.Entry<String, String> name2 = iterator.next();
                if (name1.getValue().equals(name2.getValue())){
                    strings.add(name1.getValue());
                    strings.add(name2.getValue());
                    
                }
            }
        }
        
        for (int index = 0; index < strings.size(); index++) {
            removeItemFromMapByValue(map, strings.get(index));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    
    
    public static void main(String[] args) {
        removeFirstNameDuplicates(createMap());
    }
}
