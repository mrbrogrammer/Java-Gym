package com.codegym.task.task20.task2027;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* 
Word search

*/

public class Solution {
    public static void main(String[] args) {
        int[][] wordSearch = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'s', 'a', 'm', 'e', 'j', 'j'}
        };
        detectAllWords(wordSearch, "home", "same", "same");
        /*
            Expected result
            home - (5, 3) - (2, 0)
            same - (1, 1) - (4, 1)
         */
    }
    
    public static List<Word> detectAllWords(int[][] wordSearch, String... words) {
        // list that holds all the results
        List<Word> results = new ArrayList<>();
        
        // loop over the words array and test each word
        for (String word : words) {
            char firstLetter = word.charAt(0);
            
            // loop through the char field
            for (int y = 0; y < wordSearch.length; y++) {
                for (int x = 0; x < wordSearch[y].length; x++) {
                    if (wordSearch[y][x] == firstLetter) {
                        // if the current char of the field matches the first char of the search word then inspect
                        // further inside the checkWord method
                        checkWord(x, y, wordSearch, word, results);
                    }
                }
            }
        }
        System.out.println(results);
        return results;
    }
    
    public static boolean inField(int x, int y, int[][] arr) {
        return x >= 0 && y >= 0 && x < arr[0].length && y < arr.length;
    }
    
    public static void checkWord(int startX, int startY, int[][] arr, String s, List<Word> results) {
        char[] word = s.toCharArray();
        
        // dirX, dirY specify the direction to test
        for (int dirY = -1; dirY <= 1; dirY++) {
            for (int dirX = -1; dirX <= 1; dirX++) {
                
                // skip if x == 0 and y == 0 as this is no valid direction
                if (dirX == 0 && dirY == 0)
                    continue;
                
                // x,y: the position of the current char to test against word, also the end position
                int
                        x = startX,
                        y = startY;
                
                // index [0] of word already matched inside the detectAllWords lool.
                // Now we check each other char of the word
                int pos = 1; // start index of the char to test
                while (pos < word.length) {
                    
                    // the direction to test is x/y, eg, in the first iteration -1/-1
                    // that direction we add to the start positions x and y and have a position to test
                    x += dirX;
                    y += dirY;
                    
                    // check if this position is still inside the array
                    if (!inField(x, y, arr))
                        break;
                    
                    // check if the char matches
                    if (arr[y][x] != word[pos])
                        break;
                    
                    // check if we reached the end of the word, if yes, add it to the results list
                    if (++pos == word.length) {
                        Word word1 = new Word(s);
                        word1.setStartPoint(startX, startY);
                        word1.setEndPoint(x, y);
                        results.add(word1);
                        
                        
                    }
                }
            }
        }
    }
    
    
    public static class Word implements Serializable {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
