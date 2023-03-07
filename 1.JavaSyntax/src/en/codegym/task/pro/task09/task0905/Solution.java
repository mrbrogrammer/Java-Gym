package en.codegym.task.pro.task09.task0905;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
Octal converter

The public static toOctal(int) method must convert the integer received as an input parameter from the decimal numeral system into octal. And conversely, the public static toDecimal(int) method converts from the octal system into decimal.
The methods only work with positive numbers. If the input parameter is less than or equal to 0, the methods return 0.
Your task is to implement these methods.
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //write your code here
        if (decimalNumber > 0){
            int octalDigits = 0;
            for (int i = 0; decimalNumber != 0; i++) {
                octalDigits = (int) (octalDigits + (decimalNumber % 8) * Math.pow(10, i));
                decimalNumber = decimalNumber / 8;
            }
            return octalDigits;
        }
        return 0;
    }

    public static int toDecimal(int octalNumber) {
        //write your code here
        if (octalNumber > 0){
            String octal = String.valueOf(octalNumber);
            int decimal = 0;
            for (int i = 0; i < octal.length()-1; i++) {
                decimal += (Integer.parseInt(String.valueOf(octal.charAt(i))) * Math.pow(8,octal.length()-1-i));
            }
            return decimal + Integer.parseInt(String.valueOf(octal.charAt(octal.length()-1)));
        }
        return 0;
    }
}
