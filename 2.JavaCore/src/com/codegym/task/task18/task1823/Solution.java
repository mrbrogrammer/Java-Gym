package com.codegym.task.task18.task1823;

import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

Threads and bytes
Read file names from the console until the word "exit" is entered.
Pass the file name to the ReadThread thread.
The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
where the String parameter is the file name and the Integer parameter is the relevant byte.
Close the streams.


Requirements:
1. The program must read file names from the console until the word "exit" is entered.
2. For each file, create and start a ReadThread thread.
3. After each thread is start, ReadThread should create its own file input stream.
4. Then each thread must find the most frequently occurring byte in its file and add it to resultMap.
5. The file input stream in each thread must be closed.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            // Implement constructor body
        }
        // Implement file reading here
    }
}
