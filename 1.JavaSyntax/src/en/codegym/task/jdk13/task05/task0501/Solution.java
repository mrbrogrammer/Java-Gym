package en.codegym.task.jdk13.task05.task0501;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sicks", 8,25,50);
        Cat cat2 = new Cat("Tom", 8,25,51);
        Cat cat3 = new Cat("Russo", 1, 10, 20);
    
        System.out.println(cat2.fight(cat1));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat3.fight(cat2));
    }

    public static class Cat {
        //write your code here
        private String name;
        private int age;
        private int weight;
        private int strength;
        static int count;
        
        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
            count += 1;
        }
        
        //Cat class must have a fight method.
        public boolean fight(Cat anothoerCat){
            /*implement the mechanism for feline combat based on their weight, age, and strength
            in accordance with the task conditions.
            */
            
            int wins = 0;
            int loose = 0;
            
            if (this.strength > anothoerCat.strength){
                wins++;
            } else if (this.strength < anothoerCat.strength) {
                loose++;
            }
            if (this.age > anothoerCat.age) {
                wins++;
            } else if (this.age < anothoerCat.age) {
                loose++;
            }
            if (this.weight > anothoerCat.weight) {
                wins++;
            } else if (this.weight < anothoerCat.weight) {
                loose++;
            }
    
            if (wins > 1) {
                return true;
            } else if (wins == 1 && loose == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
