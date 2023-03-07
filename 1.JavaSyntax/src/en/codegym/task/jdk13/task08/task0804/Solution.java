package en.codegym.task.jdk13.task08.task0804;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Display a list of keys
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //write your code here
    
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
    
            System.out.println(key);
        }
    }
}
