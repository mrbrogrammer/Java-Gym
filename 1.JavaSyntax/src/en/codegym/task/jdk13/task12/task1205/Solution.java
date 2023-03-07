package en.codegym.task.jdk13.task12.task1205;

/**
But that's how I want it
1. The toCustomString method must divide the input parameter by 2 and add the letter b at the end, if the input parameter is a Byte object.
2. The toCustomString method must divide the input parameter by 3 if the input parameter is an Integer object.
3. The toCustomString method must multiply the input parameter by 20 if the input parameter is a Double object.
4. The toCustomString method should return the string "I didn't expect this type of number!", if the input parameter is not a Byte, Integer, or Double.
5. To determine the type, you need to use the instanceof operator.
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "I didn't expect this type of number!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //write your code here
        
        //if the input parameter is a Byte object.
        if (number instanceof Byte){
            //divide the input parameter by 2 and add the letter b at the end,
            Byte result = (byte) (number.byteValue() / 2);
            return result + "b";
        } else if (number instanceof Integer) {
            //divide the input parameter by 3 if the input parameter is an Integer object.
            int result = number.intValue() / 3;
            return String.valueOf(result);
        } else if (number instanceof Double) {
            //multiply the input parameter by 20 if the input parameter is a Double object.
            Double result = number.doubleValue() * 20;
            return String.valueOf(result);
        } else {
            return UNEXPECTED_TYPE;
        }
    }
}
