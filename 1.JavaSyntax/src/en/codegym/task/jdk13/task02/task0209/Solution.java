package en.codegym.task.jdk13.task02.task0209;

/**
Three dogs are a force

1. The program should not display text on the screen.
2. The main method should have only three variables.
3. The variables must be immediately assigned values.
4. Each Dog object must be assigned a name.
5. The Dog class must have a single variable called name.
6. The Dog class should not have methods.
*/

public class Solution {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        //write your code here
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
