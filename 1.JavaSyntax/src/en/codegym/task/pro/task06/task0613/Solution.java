package en.codegym.task.pro.task06.task0613;

/* 
Giant cities
*/

public class Solution {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York City", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of " + city + " is " + population + " million.");
        System.out.println("But in the most populous city, " + Solution.city + ", the population is " + Solution.population + " million.");
    }
}
