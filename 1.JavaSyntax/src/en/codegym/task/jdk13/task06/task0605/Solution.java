package en.codegym.task.jdk13.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
Controlling body weight
1. The calculateBMI method should display text on the screen.
2. The calculateBMI method should display "Underweight: BMI < 18.5" if the body mass index is less than 18.5 (not inclusive).
3. The calculateBMI method should display "Normal: 18.5 <= BMI < 25" - if the body mass index is between 18.5 and 25 (not inclusive).
4. The calculateBMI method should display "Overweight: 25 <= BMI < 30" - if the body mass index is between 25 and 30 (not inclusive).
5. The calculateBMI method should display "Obese: BMI >= 30" if the body mass index is 30 or more.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // write your code here
            
            // implement (BMI) = weight in kg / (height in meters * height in meters)
            double bmi = (weight / (height * height));
    
            DecimalFormat formatBMI = new DecimalFormat("#.#");
            
            bmi = Double.parseDouble(formatBMI.format(bmi));
            // must get the format BMI to 1 decimal place
            if (bmi < 18.5) System.out.println("Underweight: BMI < 18.5");
            if (bmi >= 18.5 && bmi < 25) System.out.println("Normal: 18.5 <= BMI < 25");
            if (bmi >= 25 && bmi < 30) System.out.println("Overweight: 25 <= BMI < 30");
            if (bmi >= 30) System.out.println("Obese: BMI >= 30");
        }
    }
}
