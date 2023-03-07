package en.codegym.task.jdk13.task08.task0819;

import java.util.*;

/* 
Set of cats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
    
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<>();
        Cat tommy = new Cat("tommy");
        Cat mickey = new Cat("mickey");
        Cat alfredo = new Cat("alfredo");
        
        cats.add(tommy);
        cats.add(mickey);
        cats.add(alfredo);
    
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1
    public static class Cat {
        String name;
    
        public Cat() {
        
        }
        
        public Cat(String name) {
            this.name = name;
        }
    }
}
