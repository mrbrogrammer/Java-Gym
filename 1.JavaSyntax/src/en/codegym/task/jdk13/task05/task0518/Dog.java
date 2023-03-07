package en.codegym.task.jdk13.task05.task0518;

/**
Dog registration
1. The Dog class must have a String variable name.
2. The Dog class must have an int variable height.
3. The Dog class must have a String variable color.
4. The class must have a constructor that takes a name as an argument and initializes the corresponding instance variable.
5. The class must have a constructor that takes a name and height as arguments, and initializes the corresponding instance variables.
6. The class must have a constructor that takes a name, height, and color as arguments, and initializes the corresponding instance variables.
*/


public class Dog {
    //write your code here
    public String name;
    public int height;
    public String color;
    
    public Dog(String name){
        this.name = name;
        height = 3;
        color = "Brown";
    }
    
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
        color = "Brown";
    }
    
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
