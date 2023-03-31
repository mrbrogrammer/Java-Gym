package com.codegym.task.task18.task1827;

/*
Prices

Prices
CrUD for a table inside a file.
Read a file name for CrUD operations from the console.

The program is started with the following arguments:
-c productName price quantity

Argument values:
where id is 8 characters.
productName is 30 characters.
price is 8 characters.
quantity is 4 characters.
-c adds the product with the specified parameters to the end of the file, and generates an id by incrementing the maximum id found in the file.

The file data is stored in the following order (without separating spaces):
id productName price quantity

Each data field is padded with spaces up to its length.

Before adding a new line, re-write all of its contents to the file.

Example:
19847   Swim trunks, blue             159.00  12
198479  Swim trunks, black with printe173.00  17
19847983Snowboard jacket with reflecti10173.991234


Requirements:
1. The program should read a file name for CrUD operations from the console.
2. The Solution class should not use static variables.
3. When you run the program without arguments, the product list must remain unchanged.
4. When the program is run with the arguments "-c productName price quantity", a new line with the corresponding product should be added to the end of the file.
5. The product must have the next id after the maximum id found in the file.
6. The format of the new product line must precisely match that format specified in the task.
7. The file streams must be closed.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedReader inStream = new BufferedReader(new FileReader("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task18/task1827/data.txt"));
        BufferedWriter outStream = new BufferedWriter(new FileWriter("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task18/task1827/out.txt"));
    
        if (args[0].equalsIgnoreCase("-c")) {
    
            List<String> list = new ArrayList<>();
            while (inStream.ready()) {
                String s = inStream.readLine();
                list.add(s);
            }
            list.sort(null);
    
            Collections.reverse(list);
    
            String[] ids = new String[list.size()];
            String[] productNames = new String[list.size()];
            String[] prices = new String[list.size()];
            String[] available = new String[list.size()];
    
            for (int i = 0; i < list.size(); i++) {
        
                String id = "";
                String numbers = "";
                for (int index = 0; index < list.get(i).length(); index++) {
                    try {
                        Integer.parseInt(String.valueOf(list.get(i).charAt(index)));
                        numbers += list.get(i).charAt(index);
    
                    } catch (NumberFormatException e) {
                        id = numbers;
                        break;
                    }
                }
        
                String val = "";
                String productName = "";
                for (int index = numbers.length(); index < list.get(i).length(); index++) {
                    try {
                        Integer.parseInt(String.valueOf(list.get(i).charAt(index)));
                        productName = val;
                        break;
    
                    } catch (NumberFormatException e) {
                        val += list.get(i).charAt(index);
                    }
                }
        
        
                String num = "";
                String price = "";
                for (int index = numbers.length() + productName.length(); index < list.get(i).length(); index++) {
                    try {
                        if (list.get(i).charAt(index) == '.') {
                            num += list.get(i).charAt(index);
                            continue;
                        }
    
                        Integer.parseInt(String.valueOf(list.get(i).charAt(index)));
    
                        num += list.get(i).charAt(index);
    
    
                    } catch (NumberFormatException e) {
                        price = num;
                        break;
                    }
                }
        
                String quantity = "";
                for (int index = numbers.length() + productName.length() + price.length() + 1; index < list.get(i).length(); index++) {
                    quantity += list.get(i).charAt(index);
                }
        
                ids[i] = id;
                productNames[i] = productName;
                prices[i] = price;
                available[i] = quantity;
        
            }
    
            System.out.println(list);
    
            String newId = String.valueOf(Integer.parseInt(ids[ids.length - 1]) * 100);
    
            String[] result = new String[list.size() + 1];
            for (int index = 0; index < list.size(); index++) {
                String buffer = "";
    
    
                for (int i = 0; i < newId.length(); i++) {
                    if (ids[index].length() < newId.length()) {
                        ids[index] += " ";
                    }
                }
                buffer += ids[index];
                
                System.out.println(productNames[productNames.length - 1].length());
    
                int product;
                if (productNames[productNames.length - 1].length() > args[1].length())
                {
                    product = productNames[productNames.length - 1].length() - 1;
                } else {
                    product = args[1].length() - 1;

                }
                
                for (String productName : productNames) {
                    System.out.println(productName);
                }
    
//                System.out.println(productNames[1].length());
                productNames[index] = productNames[index].substring(1, productNames[index].length() - 1);
                
                for (int i = 0; i < args[1].length(); i++) {
                    if (productNames[index].length() < args[1].length()) {
                        productNames[index] += " ";
                    }
                }
                buffer += productNames[index];
    
    
                for (int i = 0; i < args[2].length(); i++) {
                    if (prices[index].length() < args[2].length()) {
                        prices[index] += " ";
                    }
                }
                buffer += prices[index];
    
//                int howMany;
//                if (available[available.length-1].length() > args[3].length()) {
//                    howMany = a
//                }
                
                for (int i = 0; i < args[2].length() -1; i++) {
                    if (available[index].length() < args[2].length() -1) {
                        available[index] += " ";
                    }
                }
                buffer += available[index];

                result[index] = buffer;
            }
            
            String input = newId + args[1] + args[2] + args[3];
    
            result[result.length - 1] = input;
    
            for (String s : result) {
                for (int i = 0; i < input.length(); i++) {
                    outStream.write(s.charAt(i));
                }
                outStream.write("\n");
            }
    
        }
        
        inStream.close();
        outStream.close();
        
    }
}
