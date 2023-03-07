package en.codegym.task.jdk13.task12.task1203;

/**
Conscious choice
 
 1. The isByte method must return true if the input argument can be narrowed to a byte without loss of precision.
 2. The isShort method must return true if the input argument can be narrowed to a short without loss of precision.
 3. The isInt method must return true if the input argument can be narrowed to an int without loss of precision.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        boolean result = l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE;
        return result;
    }

    public static boolean isShort(long l) {
        boolean result = l <= Short.MAX_VALUE && l >= Short.MIN_VALUE;
        return result;
    }

    public static boolean isInt(long l) {
        boolean result = l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE;
        return result;
    }
}
