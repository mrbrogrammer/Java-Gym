package en.codegym.task.jdk13.task02.task0204;

/**
Family relations

1. In the main method, create a Man object and save a reference to it in the variable man.
2. In the main method, create a Woman object and save a reference to it in the variable woman.
3. In the main method, store a reference to the previously created Woman object in man.wife.
4. In the main method, store a reference to the previously created Man object in woman.husband.
5. The Man class must have 3 variables.
6. The Woman class must have 3 variables.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
