package en.codegym.task.jdk13.task02.task0213;

/**
Every animal should have an owner

1. The program should not display text on the screen.
2. In the main method, create Cat, Dog, Fish, and Woman objects, and store references to them in variables.
3. In the main method, set the Woman object as the owner of each animal.
4. The Cat, Dog, and Fish classes must have only one Woman variable named owner.
5. The Woman class must not have variables.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;
        Dog dog = new Dog();
        dog.owner = woman;
        Fish fish = new Fish();
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
