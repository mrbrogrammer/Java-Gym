package en.codegym.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/**
Map of 10 pairs
,
,
,
,
iris - flower,
.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Map<String, String> map = new HashMap<>();
        
        map.put("watermelon", "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");
    
    
        for (Map.Entry<String, String> value:
             map.entrySet()) {
            String key = value.getKey();
            String val = value.getValue();
    
            System.out.printf("%s - %s\n", key, val);
        }
    }
}
