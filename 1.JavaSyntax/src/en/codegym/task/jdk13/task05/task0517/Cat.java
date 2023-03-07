package en.codegym.task.jdk13.task05.task0517;

/**
Creating cats
1. The Cat class must have a String name variable.
2. The Cat class must have an int age variable.
3. The Cat class must have an int weight variable.
4. The Cat class must have a String variable address.
5. The Cat class must have a String variable color.
6. The class must have a constructor that takes a name as an argument, but initializes all variables except the address.
7. The class must have a constructor that takes a name, weight, and age as arguments, and initializes all variables except the address.
8. The class must have a constructor that takes a name and age as arguments, and initializes all variables except the address.
9. The class must have a constructor that takes a weight and color as arguments, and initializes all variables except the name and address.
10. The class must have a constructor that takes a weight, color, and address as arguments, and initializes all variables except the name.
*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address;
    String color;
    
    public Cat(String name) {
        this.name = name;
        age = 2;
        weight = 12;
        color = "brown";
    }
    
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "brown";
    }
    
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 12;
        color = "brown";
    }
    
    public Cat(int weight, String color) {
        age = 2;
        this.weight = weight;
        this.color = color;
    }
    
    public Cat(int weight, String color, String address) {
        age = 2;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
