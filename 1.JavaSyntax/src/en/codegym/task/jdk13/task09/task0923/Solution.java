package en.codegym.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        for (int index = 0; index < word.length(); index++) {
            if (isVowel(word.charAt(index))) System.out.print(word.charAt(index)+ " ");
        }
        System.out.println();
        for (int index = 0; index < word.length(); index++) {
            if (!(isVowel(word.charAt(index))) && word.charAt(index) != ' ') System.out.print(word.charAt(index)+ " ");
        }
        
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}