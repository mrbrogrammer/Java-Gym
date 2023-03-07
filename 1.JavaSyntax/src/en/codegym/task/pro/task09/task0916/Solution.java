package en.codegym.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "My name is %s. I will earn $%d a month.";
        //write your code here
        
        String someString = new String("1");
        String otherString = someString;
        String nextString = "1";
        String newString = "1";
        Integer number = new Integer(0);
        System.out.println(phrase);
        System.out.println(someString);
        System.out.println(otherString == someString);
        System.out.println(otherString == nextString);
        System.out.println(someString == nextString);
        System.out.println(someString.equals(nextString));
        System.out.println(otherString.equals(nextString));
        System.out.println(nextString == newString);
        System.out.println(otherString.equals(newString));
        System.out.println(otherString.equals(someString));
        System.out.println(number);
 
        return String.format(phrase, name, salary);
    }
}
