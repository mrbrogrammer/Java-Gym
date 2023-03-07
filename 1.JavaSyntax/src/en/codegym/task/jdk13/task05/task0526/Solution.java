package en.codegym.task.jdk13.task05.task0526;

/**
Man and woman
1. In the Solution class, create a public static Man class.
2. In the Solution class, create a public static Woman class.
3. The Man class must have variables: String name, int age, and String address.
4. The Woman class must have variables: String name, int age, and String address.
5. The Man and Woman classes must have constructors that take String, int, and String arguments.
6. The constructors must initialize the instance variables.
7. In the main method, you need to create two objects of each type.
8. The main method should display the created objects on the screen in the specified format.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Sam", 34, "JHB");
        Man man2 = new Man("Simphiwe", 23, "CPT");
        System.out.printf("%s %d %s\n", man1.name, man1.age, man1.address);
        System.out.printf("%s %d %s\n", man2.name, man2.age, man2.address);
        
        Woman woman1 = new Woman("Georgia", 23, "NY");
        Woman woman2 = new Woman("Rossy", 28, "LA");
        System.out.printf("%s %d %s\n", woman1.name, woman1.age, woman1.address);
        System.out.printf("%s %d %s\n", woman2.name, woman2.age, woman2.address);
    }

    //write your code here
    public static class Man {
        public String name;
        public int age;
        public String address;
        
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    
    public static class Woman {
        public String name;
        public int age;
        public String address;
        
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
