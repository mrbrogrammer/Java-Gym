package en.codegym.task.jdk13.task05.task0520;

/**
Populate the Rectangle class
1. The Rectangle class must have int variables top, left, width and height.
2. The class must have at least one constructor.
3. The class must have at least two constructors.
4. The class must have at least three constructors.
5. The class must have at least four constructors.
*/


public class Rectangle {
    //write your code here
    private int top, left, width, height;
    
    public Rectangle(int top){
        this.top = top;
        left = 2;
        width = 5;
        height = 2;
    }
    
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        width = 5;
        height = 2;
    }
    
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = 2;
    }
    
    public Rectangle(Rectangle rectangle, int height){
        top = rectangle.top;
        left = rectangle.left;
        width = rectangle.width;
        this.height = height;
    }
    
    public static void main(String[] args) {

    }
}
