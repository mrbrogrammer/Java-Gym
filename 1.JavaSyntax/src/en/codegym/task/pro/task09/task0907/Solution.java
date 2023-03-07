package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 734;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //write your code here
        //The methods only work with positive numbers and non-empty strings.
        if (decimalNumber <= 0) {
            
            return "";
        }
        StringBuilder hexadecimal = new StringBuilder();
        String tmp = "";
        for (; decimalNumber != 0;) {
            hexadecimal.append(HEX.charAt(decimalNumber % 16));
            tmp += decimalNumber % 16;
//            System.out.println(tmp % 16);
            decimalNumber = decimalNumber / 16;
            System.out.println(45 * 16);
        }
        System.out.println(tmp);
        return hexadecimal.reverse().toString();
    }

    public static int toDecimal(String hexNumber) {
        //write your code here
        //The methods only work with positive numbers and non-empty strings.
        if (hexNumber == null) {
            return 0;
        }
        int decimal = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16 * decimal + Integer.parseInt(String.valueOf(HEX.indexOf(String.valueOf(hexNumber.charAt(i)))));
        }
        return decimal;
    }
}
