package com.codegym.task.task18.task1828;

/* 
Prices 2

Prices 2
CrUD for a table inside a file
Read a file name for CrUD operations from the console

The program runs with one of the following sets of arguments:
-u id productName price quantity
-d id

Argument values:
where id is 8 characters
productName is 30 characters
price is 8 characters
quantity is 4 characters
-u updates the data for the product with the specified id
-d performs the physical deletion of the product with the specified id (all data related to the passed id)

The file data is stored in the following order (without separating spaces):
id productName price quantity
Each data field is padded with spaces up to its length

Example:
19847   Swim trunks, blue             159.00  12
198479  Swim trunks, black with printe173.00  17
19847983Snowboard jacket with reflecti10173.991234


Requirements:
1. The program should read a file name for CrUD operations from the console.
2. When you run the program without arguments, the product list must remain unchanged.
3. When the program is started with the arguments "-u id productName price quantity", the product information in the file should be updated.
4. When the program is started with the arguments "-d id", the line for the product with the specified id should be removed from the file.
5. The file streams must be closed.
*/

public class Solution {
    public static void main(String[] args) {

    }
}
