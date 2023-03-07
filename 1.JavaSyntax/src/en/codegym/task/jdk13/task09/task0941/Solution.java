package en.codegym.task.jdk13.task09.task0941;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
IPv6
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        //write your code here
        StringTokenizer ipv6Tokens = new StringTokenizer(ipv6);
        ArrayList<String> ipv6Array = new ArrayList<>();
        
        for (; ipv6Tokens.hasMoreElements();) {
            ipv6Array.add(ipv6Tokens.nextToken(":"));
        }
        
        String[] newArray = new String[ipv6Array.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = ipv6Array.get(i);
        }
        
        return newArray;
    }
}
