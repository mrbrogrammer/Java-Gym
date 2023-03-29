package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
    
        FileInputStream inStream = new FileInputStream(filename1);
        FileOutputStream outStream = new FileOutputStream(filename2);
        
        String num = "";
        while (true) {
            char c = (char) inStream.read();
            if ((inStream.available() >= 0)) {
                if (!(c == ' ') && c != '￿') {
                    num += c;
                }
                
                if (num.isEmpty())
                    break;
                
                if ((c == ' ') || inStream.available() == 0) {
                    float scale = (float) (Float.parseFloat(num) * Math.pow(10, 2));
                    String number = "";
                    if (Float.parseFloat(num) < 0) {
                        
//                        num = String.valueOf(Math.ceil(scale) / 100);

                        // decimal point
                        int decimalPoint = 2;
    
                        // convert the double value in string
                        String tempValue = num;
                        String stringValue = "";
    
                        int counter = -1;
    
                        for (int i = 0; i < tempValue.length(); ++i) {
        
                            // checking the condition
                            if (counter > decimalPoint) {
                                break;
                            }
                            else
        
                            if (tempValue.charAt(i) == '.') {
                                counter = 1;
                            }
                            else if (counter >= 1) {
            
                                ++counter;
                            }
        
                            // converting the number into string
                            stringValue += tempValue.charAt(i);
                        }
    
                        String e = (String) num.subSequence(stringValue.length() - 2, stringValue.length());
                        e = e.replace(".", "");
    
                        if ((Integer.parseInt(e) + 50) > 51) {
                            number = String.valueOf((Math.round(Float.parseFloat(num))));
                        } else {
                            number = String.valueOf((Math.round(Float.parseFloat(num))) - 1);
                        }
    
                    } else {
                        number = String.valueOf(Math.round((Float.parseFloat(num))));
                    }
        
                    if ((inStream.available() > 1))
                        number += " ";
        
                    outStream.write(number.getBytes());
                    num = "";
                }
            } else {
                break;
            }
            
            
        }
        
        inStream.close();
        outStream.close();
    }
}
