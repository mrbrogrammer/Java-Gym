package en.codegym.task.pro.task06.task0603;

/* 
Favorite dish
Rename the parameters of the rintPersonInfo() method:

firstName to name;
lastName to surname;
favoriteDish to meal;
without changing the program's functionality.
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Favorite dish: " + meal);
    }

}
