package en.codegym.task.jdk13.task09.task0932;

/* 
Number of words in a string
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Who wants a job?";
        int getWordCount = getWordCount(string);
        System.out.println("The number of words in the string \"" + string + "\" is " + getWordCount);
    }

    public static int getWordCount(String string) {
        //write your code here
        int wordCount = string.split(" ").length;
        return wordCount;
    }
}
