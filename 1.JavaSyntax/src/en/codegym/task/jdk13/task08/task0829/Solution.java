package en.codegym.task.jdk13.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Software update
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> list = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            String family;
            
            if (city.isEmpty()) {
                break;
            } else {
                family = reader.readLine();
            }

            list.put(city, family);
        }

        // Read the house number
        String cityName = reader.readLine();
    
        for (Map.Entry<String, String> pairs : list.entrySet()) {
            if (pairs.getKey().equals(cityName)) {
                System.out.println(pairs.getValue());
            }
        }
    }
}
