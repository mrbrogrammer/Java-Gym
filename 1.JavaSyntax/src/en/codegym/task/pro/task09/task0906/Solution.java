package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1011011110";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //write your code here
        //If the input parameter is less than or equal to 0, return an empty string.
        StringBuilder binary = new StringBuilder(new String());
        if (decimalNumber == 0 || decimalNumber < 0){
            return "";
        } else {
            for (; decimalNumber != 0;) {
                binary.append(decimalNumber % 2);
                decimalNumber = decimalNumber / 2;
            }
        }
        return binary.reverse().toString();
    }

    public static int toDecimal(String binaryNumber) {
        //write your code here
        //If the input parameter is an empty string or null, then the toDecimal(String) method returns 0.
        if (binaryNumber == null) {
            return 0;
        }
        int decimal = 0;
        for (int i = 0, decimalNumber = 0; i < binaryNumber.length(); i++) {
            decimal += (decimalNumber +
                    Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length()-1-i)))) *
                    Math.pow(2, i);
        }
        return decimal;
    }
}
