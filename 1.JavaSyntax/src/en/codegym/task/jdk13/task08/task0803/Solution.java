package en.codegym.task.jdk13.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/*
Map of cats
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"cooper", "missy", "oreo", "tiger", "lulu", "tucker", "jasmine", "jackson", "murphy", "pepper"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //write your code here
        Map<String, Cat> map = new HashMap<>();
        for (int index = 0; index < cats.length; index++) {
            map.put(cats[index], new Cat(cats[index]));
        }
        
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
