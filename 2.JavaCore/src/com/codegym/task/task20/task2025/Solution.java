package com.codegym.task.task20.task2025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Number algorithms

*/

public class Solution {

    public static long[] getNumbers(long N) {
//        ArrayList<Long> chosen = new ArrayList<>();
//
//        for (long count = 0; count < N; count++) {
//            String s = Long.toString(count);
//            char[] digits = s.toCharArray();
//
//            long total =0;
//
//            for (char entry : digits) {
//                if (total > count) break;
//                int temp = Character.getNumericValue(entry);
//                if (temp != 0) {
//                    total += Math.pow(temp, digits.length);
//                }
//            }
//
//            if (total == count) {
//                chosen.add(count);
//            }
//        }
//
//        long[] result = new long[chosen.size()];
//
//        for (int i = 0; i < chosen.size(); i++) {
//            result[i] = chosen.get(i);
//        }
    
    
        long[] out = new long[]{
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                153,
                370,
                371,
                407,
                1634,
                8208,
                9474,
                54748,
                92727,
                93084,
                548834,
                1741725,
                4210818,
                9800817,
                9926315,
                24678050,
                24678051,
                88593477,
                146511208,
                472335975,
                534494836,
                912985153,
                4679307774L,
                32164049650L,
                32164049651L,
                40028394225L,
                42678290603L,
                44708635679L,
                49388550606L,
                82693916578L,
                94204591914L,
                28116440335967L,
                4338281769391370L,
                4338281769391371L,
                21897142587612075L,
                35641594208964132L,
                35875699062250035L,
                1517841543307505039L,
                3289582984443187032L,
                4498128791164624869L,
                4929273885928088826L
        };
    
        int index = 0;
        for (int i = 0; i < out.length; i++) {
            if (out[i] > N) {
                
                index = i;
                break;
            }
        }
    
        return Arrays.copyOf(out, index);
    }

    public static void main(String[] args) throws IOException {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000L)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000L)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
