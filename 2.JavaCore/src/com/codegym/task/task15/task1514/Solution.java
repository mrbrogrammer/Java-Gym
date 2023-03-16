package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    
    static // static block
    {
        labels.put(34.0, "tap");
        labels.put(100.0, "electricity");
        labels.put(50.0, "bread");
        labels.put(12.0, "cup");
        labels.put(200.0, "window");
    }
    
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
