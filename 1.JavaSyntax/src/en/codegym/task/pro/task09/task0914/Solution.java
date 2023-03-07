package en.codegym.task.pro.task09.task0914;

/* 
Path update
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //write your code here
        return path.replaceFirst("jdk.+?/", jdk + "/");
    }
}
