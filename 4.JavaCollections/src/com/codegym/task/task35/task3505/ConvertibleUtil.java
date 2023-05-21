package com.codegym.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertibleUtil {

    public static  <K, V extends Convertible> Map<K, V> convert(List<V> list) {
        Map<K, V> result = new HashMap<>();
        int count = 0;
        for (V ele : list) {
//            Integer key = ele instanceof ConvertibleUser ? (((ConvertibleUser) ele).getKey()) : count++;
//            (ConvertibleUser) ele).getKey() = count++
            result.put((K) ele.getKey(), ele);
        }
        return result;
    }
//
//    /**
//     * @return
//     */
//    @Override
//    public Integer getKey() {
//        return 0;
//    }
}