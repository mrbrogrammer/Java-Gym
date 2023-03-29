package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.*;

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

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            } else {
                Thread s = new ReadThread(fileName);
                s.start();
                s.join();
            }
        }
    }

    public static class ReadThread extends Thread {
        
        private FileInputStream inStream;
        
        private String fileName;
        
        public ReadThread(String fileName) throws FileNotFoundException, IOException {
            // Implement constructor body
            this.fileName = fileName;
            this.inStream = new FileInputStream(fileName);
        }
        
        // Implement file reading here
        @Override
        public void run() {
            List<Integer> bytes = new ArrayList<>();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            
            while (true) {
                try {
                    
                    char c = (char) inStream.read();
                    
                    bytes.add((int) c);
                    
                    if (! (inStream.available() > 0)) break;
                    
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    
            try {
                inStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            
            SortedMap<Integer, Integer> result = new TreeMap<>();
            
            for (int i = 0; i < bytes.size(); i++ ) {
                int count = 0;
                for (int j = 1; j < bytes.size(); j++ ) {
                    if (bytes.get(i) == bytes.get(j)) {
                        count++;
                    }
                }
                result.put(count, bytes.get(i));
            }
            
            synchronized (resultMap) {
                resultMap.put(fileName, result.get(result.lastKey()));
            }
            
            for (Map.Entry<String, Integer> pair: resultMap.entrySet()) {
                System.out.println(pair.getKey());
                System.out.println(pair.getValue());
            }
            
        }
        
        
    }
}
