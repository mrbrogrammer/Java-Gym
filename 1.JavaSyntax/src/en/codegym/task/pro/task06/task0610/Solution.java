package en.codegym.task.pro.task06.task0610;

/* 
The struggle for access
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("John", "Dane");
        System.out.println("Dossier:");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}
