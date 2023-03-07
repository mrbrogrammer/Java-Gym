package en.codegym.task.jdk13.task05.task0521;

/**
Calling a constructor from a constructor
1. The class must have 3 constructors.
2. The constructor with two parameters must initialize the variables x and y to the passed values.
3. The constructor with two parameters must initialize the variable radius to a value of 10.
4. The constructor with two parameters must call another constructor, passing the correct arguments.
5. Don't change the main method.
6. Don't change the default constructor.
*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //write your code here
        this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
