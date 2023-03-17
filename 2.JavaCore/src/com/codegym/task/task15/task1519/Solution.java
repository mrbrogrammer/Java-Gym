package com.codegym.task.task15.task1519;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = null;
        
        String input = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            do {
                input = reader.readLine();
                if ((input.equals("exit")))
                    break;
                else {
                    int countA = 0;
                    int countB = 0;
                    int countC = 0;
                    
                    for (int index = 0; index < input.length(); index++) {
                        if (input.charAt(index) == '.') {
                            countA++;
                        } else if ((String.valueOf(input.charAt(index)).matches("[a-z]"))) {
                            countB++;
                        } else {
                            countC++;
                        }
                    }
                    
                    if (countB > 0) {
                        print(input);
                    } else if (countA > 0 && countB == 0 && countC > 0) {
                        Double result = Double.valueOf(input);
                        print(result);
                    } else {
                        if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 128) {
                            short result = (short) Integer.parseInt(input);
                            print(result);
                        } else {
                            Integer result = Integer.parseInt(input);
                            print(result);

                        }
                    }
                }
                
            } while (true);
            
        } catch (NumberFormatException e) {
//            print(input);
            return;
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
