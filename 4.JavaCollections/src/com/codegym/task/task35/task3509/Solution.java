package com.codegym.task.task35.task3509;

import java.util.*;


/* 
Collections & Generics

*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //write your code here
        return new ArrayList<T>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //write your code here
        return new HashSet<T>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K , V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) throw new IllegalArgumentException("List are not same size!");
        
        HashMap<Object, Object> result = new HashMap<>();
        for (int index = 0; index < keys.size(); index++)
            result.put(keys.get(index), values.get(index));
        
        return (HashMap<K, V>) result;
        
    }
}
