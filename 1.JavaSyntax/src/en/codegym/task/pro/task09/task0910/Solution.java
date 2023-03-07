package en.codegym.task.pro.task09.task0910;

/* 
Unicode encoding
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //write your code here
        
        
        char[] values = {
                '\u00A9',
                '\u004A',
                '\u0061',
                '\u0076',
                '\u0061',
                '\u0052',
                '\u0075',
                '\u0073',
                '\u0068'
        };
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = values[i];
            
//            Arrays.fill(symbols, symbols[i], symbols[i == symbols.length - 1 ? i : i+1], values[i]);
        }
        
        
    }
}
