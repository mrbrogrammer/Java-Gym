package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

import java.util.Arrays;

public class Solution {
    private static final String HEX = "0123456789abcdef";
    
    public static void main(String[] args) {
        String binaryNumber = "100000001110";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "80e";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }
    
    public static String toHex(String binaryNumber) {
        //write your code here
        
        //If the input parameter contains any character other than 0 or 1, then the method returns an empty string.
        if (binaryNumber == null) {
            return "";
        } else {
            // add characters to make len of binary number a whole number
            StringBuilder newBinaryNumber = new StringBuilder();
            for (int l = binaryNumber.length() - 1; l >= 0; l--) {
                if (! (binaryNumber.charAt(l) == 48 || binaryNumber.charAt(l) == 49)){
                    return "";
                }
                newBinaryNumber.append(binaryNumber.charAt(l));
            }
            if (newBinaryNumber.length() % 4 != 0) {
                for (; newBinaryNumber.length() % 4 != 0; ) {
                    newBinaryNumber.append("0");
                }
            }
            newBinaryNumber.reverse();
            //
            StringBuilder hexadecimal = new StringBuilder();
            for (int i = 0; i < (newBinaryNumber.length() / 4); i++) {
                int[] binary = new int[4];
                for (int j = i * 4, counter = 0; j < 4 * (i + 1); j++) {
                    Arrays.fill(binary, counter, counter == 4 ? counter : counter + 1, Integer.valueOf(String.valueOf(newBinaryNumber.charAt(j))));
                    counter++;
                }
                //
                int decimal = 0;
                for (int k = 0, decimalNumber = 0; k < binary.length; k++) {
                    decimal += (decimalNumber +
                            binary[binary.length - 1 - k]) *
                            Math.pow(2, k);
                }
                if (decimal == 0) {
                    hexadecimal.append("0");
                }
                for (; decimal != 0; ) {
                    hexadecimal.append(HEX.charAt(decimal % 16));
                    decimal = decimal / 16;
                }
            }
            return hexadecimal.toString();
        }
    }
    
    public static String toBinary(String hexNumber) {
        //write your code here
        
        //If the input parameter contains any character other than 0 or 1, then the method returns an empty string.
        StringBuilder newBinary = new StringBuilder();
    
        if (hexNumber == null || hexNumber.equals("")) {
            return "";
        } else {
            for (int i = 0; i < hexNumber.length(); i++) {
                if (String.valueOf(hexNumber.charAt(i)).matches("[a-f]") || String.valueOf(hexNumber.charAt(i)).matches("[0-9]")) {
                } else {
                    return "";
                }
            }
            // change hexadecimal into decimal
            
            // change decimal into binary
            // check if the len of the binary is equal to multiple of 4
            for (int i = 0; i < hexNumber.length(); i++) {
                StringBuilder binary = new StringBuilder();
    
                String newDecimalNumber = String.valueOf(HEX.indexOf(String.valueOf(hexNumber.charAt(i))));
    
                if (! (newDecimalNumber.equals("0"))) {
                    for (; ! (newDecimalNumber.equals("0")); ) {
                        binary.append(Integer.valueOf(newDecimalNumber) % 2);
    
                        newDecimalNumber = String.valueOf(Integer.valueOf(newDecimalNumber) / 2);
                    }
                } else {
                    binary.append("0");
                }
                while (binary.length() % 4 != 0) {
                    binary.append("0");
                }
                binary.reverse();
                newBinary.append(binary);
            }
            return newBinary.toString(); // 111001011111
        }
    }
    
}