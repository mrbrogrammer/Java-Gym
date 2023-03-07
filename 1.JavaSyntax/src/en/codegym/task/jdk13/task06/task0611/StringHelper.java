package en.codegym.task.jdk13.task06.task0611;

/**
StringHelper class
1. The StringHelper class's methods must return a string.
2. The StringHelper class's methods must be static.
3. The StringHelper class's methods must be public.
4. The multiply(String s, int count) method must return a string that has been repeated count times.
5. The multiply(String s) method must return a string that has been repeated 5 times.
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        //write your code here
        for (int i = 0; i < 5; i++) {
            result += text;
        }
        
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //write your code here
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
