package en.codegym.task.jdk13.task09.task0927;

import java.util.*;

/* 
Ten cats
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<>();
        map.put("Joji", new Cat("Joji"));
        map.put("Chop", new Cat("Chop"));
        map.put("Caesar", new Cat("Caesar"));
        map.put("Pale", new Cat("Pale"));
        map.put("PeaBody", new Cat("PeaBody"));
        map.put("Rusty", new Cat("Rusty"));
        map.put("Virgo", new Cat("Virgo"));
        map.put("Mr. Tom", new Cat("Mr. Tom"));
        map.put("Ivy", new Cat("Ivy"));
        map.put("Whitey", new Cat("Whitey"));
        
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pairs : map.entrySet()) {
            set.add(pairs.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
