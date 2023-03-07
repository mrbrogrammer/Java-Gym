package en.codegym.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
Display today's date
1. The date must contain the month, day, and year, separated by a space.
2. The month should match the current month.
3. The day should match the current day.
4. The year should match the current year.
5. The entire date should be displayed on a single line.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        LocalDate today = LocalDate.now();
        System.out.printf("%d %d %d", today.getMonthValue(), today.getDayOfMonth(), today.getYear());
    }
}
