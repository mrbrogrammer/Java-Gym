package en.codegym.task.jdk13.task05.task0522;

/**
Max constructors
1. The class must have at least three variables.
2. The class must have a default constructor.
3. The class must have at least one constructor.
4. The class must have at least two constructors.
5. The class must have at least three constructors.
6. The class must have at least four constructors.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 10;
    }
    
    public Circle(double x) {
      this(x, 5);
    }
    
    public Circle() {
        this(5,5,10);
    }
    
    public static void main(String[] args) {

    }
}