package com.codegym.task.task18.task1821;

/* 
Symbol frequency

Symbol frequency
The program is started with one argument: the name of a file that contains text.
Calculate how often each symbol is encountered.
Sort the results by increasing ASCII code (read about it online).

Example:
','=44, 's'=115, 't'=116.

Display the sorted results:
[symbol1] frequency1
[symbol2] frequency2
Close the streams.

Example output:
, 19
- 7
f 361


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. You need to calculate the frequency of each symbol in the file and display the results.
4. The displayed results should be sorted by ascending ASCII code.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    
    
        SortedMap<Character, Integer> map = new TreeMap<>();
        FileInputStream fin = new FileInputStream(args[0]);
        while (fin.available() > 0) {
            map.merge((char)fin.read(), 1, Integer::sum); // what is going on here?
        }
        fin.close();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
//        FileInputStream fileInputStream = new FileInputStream(args[0]);
//        List<Integer> bytes = new ArrayList<>();

//
//        while (fileInputStream.available() > 0) {
//            int c = fileInputStream.read();
//            bytes.add(c);
//        }
//
//        Map<Character, Integer> result = new HashMap<>();
//        for (int i = 33; i < 127; i++) {
//
//            int counter = 0;
//            for (int j = 0; j < bytes.size(); j++) {
//                if (i == bytes.get(j)) {
//                    counter++;
//                }
//            }
//            if (!(i > 47 && i < 58))
//                result.put((char) i, counter);
//        }
//
//        Arrays.sort(result.keySet().toArray(), null);
//
//        for (Map.Entry<Character, Integer> pair : result.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }

//        fileInputStream.close();
    
    }
}
