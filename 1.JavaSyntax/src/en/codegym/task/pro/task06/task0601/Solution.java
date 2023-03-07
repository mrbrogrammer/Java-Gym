package en.codegym.task.pro.task06.task0601;

/* 
Separate concepts
Create a public static void printHydrogenInfo() method, which should print all the lines about hydrogen.
Also, create a public static void printJavaInfo() method, which should print all the lines about the island of Java.
Finally, in the main() method, call these two methods.

The general console output shouldn't change.
*/

public class Solution {
    public static void main(String[] args) {

        printHydrogenInfo();
        printJavaInfo();

    }

    //write your code here
    //create a public static void printHydrogenInfo() method
    public static void printHydrogenInfo(){
        System.out.println("Hydrogen:");
        System.out.println("This is a chemical element in the periodic table. Its designation is H, and its atomic number is 1.");
        System.out.println("It is the lightest element in the table.");
        System.out.println("Hydrogen is used in:");
        System.out.println("- the chemical industry");
        System.out.println("- the oil refining industry");
        System.out.println("- aviation");
        System.out.println("- power generation.");
    }
    
    //create a public static void printJavaInfo() method
    public static void printJavaInfo(){
        System.out.println("Island of Java:");
        System.out.println("It is part of Indonesia.");
        System.out.println("The states of Mataram, Majapahit, and Demak originated on the island.");
        System.out.println("Java is the most populated island in the world:");
        System.out.println("The total population is 140 million people.");
        System.out.println("The population density is 1,061 people per square kilometer.");
        System.out.println("Kopi luwak, a famous variety of coffee, is produced here.");
    }
}
