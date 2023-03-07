package en.codegym.task.jdk13.task06.task0608;

/**
Static methods: int getCatCount() and setCatCount(int)
1. The Cat class must have a getCatCount method.
2. The getCatCount method must return an int.
3. The getCatCount method must return the value of the variable catCount.
4. The Cat class must have a setCatCount method that takes an int.
5. The setCatCount method should not return anything.
6. The setCatCount method must set the variable catCount to the passed value.
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //write your code here
        return catCount;

    }

    public static void setCatCount(int catCount) {
        //write your code here
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
