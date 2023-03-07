package en.codegym.task.jdk13.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //write your code here
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        Set<Object> result = new HashSet<>(cats);
        
        
        result.addAll(dogs);
        
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        Iterator<Cat> iterator = cats.iterator();
    
        while (iterator.hasNext()) {
            pets.remove(iterator.next());
 
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object obj : pets) {
            System.out.println(obj);
        }
    }

    //write your code here
    public static class Cat {
    
    }
    
    public static class Dog {
    
    }
}
