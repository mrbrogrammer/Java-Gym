package en.codegym.task.jdk13.task07.task0724;

/*
Family census
*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human grandFather1 = new Human("Sam", true, 55);
        Human grandFather2 = new Human("Ben", true, 80);
        
        Human grandMother1 = new Human("Ellie", false, 68);
        Human grandMother2 = new Human("Beth", false, 50);
        
        Human father = new Human("George", true, 34, grandFather1, grandMother1);
        Human mother = new Human("Portia", false, 31, grandFather2, grandMother2);
        
        Human child1 = new Human("Amigo", true, 12, father, mother);
        Human child2 = new Human("Niko", true, 15, father, mother);
        Human child3 = new Human("Benjamin", true, 12, father, mother);
    
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    
    }

    public static class Human {
        // write your code here
        
        String name;
        boolean sex;
        int age;
        
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";

            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }
}