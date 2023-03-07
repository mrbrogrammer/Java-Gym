package en.codegym.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
The whole family together
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> grandFather1Children = new ArrayList<>() ;
        ArrayList<Human> grandFather2Children = new ArrayList<>();
        
        ArrayList<Human> grandMother1Children = new ArrayList<>();
        ArrayList<Human> grandMother2Children = new ArrayList<>();
        
        Human child1 = new Human("Josh", 5, true);
        Human child2 = new Human("Simon", 10, true);
        Human child3 = new Human("Gabriel", 13, false);
        
        ArrayList<Human> motherChildren = new ArrayList<>();
        ArrayList<Human> fatherChildren = new ArrayList<>();
        
        motherChildren.add(child1);
        motherChildren.add(child2);
        motherChildren.add(child3);
        fatherChildren.add(child1);
        fatherChildren.add(child2);
        fatherChildren.add(child3);
        
        Human father = new Human("George", 36, true, fatherChildren);
        Human mother = new Human("Kate", 36, false, motherChildren);
        
        grandFather1Children.add(father);
        grandFather2Children.add(mother);
        
        grandMother1Children.add(father);
        grandMother2Children.add(mother);
        
        Human grandFather1 = new Human("Peter", 68, true, grandFather1Children);
        Human grandFather2 = new Human("James", 72, true, grandFather2Children);
        
        Human grandMother1 = new Human("Ellie", 62, false, grandMother1Children);
        Human grandMother2 = new Human("Lucy", 65, false, grandMother2Children);
        
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        
        System.out.println(father);
        System.out.println(mother);
        
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        
    }
    
    public static class Human {
        //write your code here
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children = new ArrayList<>();
        
        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        
        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;
            
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;
                
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
