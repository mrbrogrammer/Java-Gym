package en.codegym.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Remove all people born in the summer
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Smith", dateFormat.parse("MAY 1 2012"));

        //write your code here
        map.put("George", dateFormat.parse("FEB 2 2000"));
        map.put("Robert", dateFormat.parse("DEC 31 1998"));
        map.put("John", dateFormat.parse("SEP 19 1784"));
        map.put("Peter", dateFormat.parse("MAY 6 1999"));
        map.put("James", dateFormat.parse("OCT 11 2003"));
        map.put("Ellie", dateFormat.parse("JAN 10 1999"));
        map.put("Diego", dateFormat.parse("MAR 22 2006"));
        map.put("Rodrigo", dateFormat.parse("JUN 20 1999"));
        map.put("Kith", dateFormat.parse("AUG 22 1996"));
        
        return map;
    
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //write your code here
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            if (pair.getValue().getMonth() <= 7 && pair.getValue().getMonth() >= 5) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
