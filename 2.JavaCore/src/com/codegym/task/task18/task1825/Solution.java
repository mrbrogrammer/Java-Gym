package com.codegym.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Building a file

Building a file
Let's build a file from various pieces.
Read file names from the console.
Each file has a name: <someName>.partN.

For example, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

The file names are supplied in random order. The word "end" is used to stop reading in file names.
In the folder where all the files are located, create a file without the "part" suffix, i.e. without ".<partN>".

For example, Lion.avi.

Use a buffer to copy all the bytes from the partial files to the created file.
Copy the first in the proper order, first the first part, then the second, ..., finally - the last part.
Close the streams.


Requirements:
1. The program must read file names from the console until the word "end" is entered.
2. Create a stream to write to the file without the "part" suffix (".<partN>") in the folder with all the "part" files.
3. Copy all the bytes from the *.partN files to the new file.
4. You should use a buffer for the reading and writing.
5. The file streams must be closed.
6. Don't use static variables.
*/

public class Solution {
    public static void main(String[] args) {
    }
}
