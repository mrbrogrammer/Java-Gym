package en.codegym.task.jdk13.task09.task0934;

/* 
Word palindrome
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //write your code here
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(word.charAt((word.length() - 1) - i)))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
