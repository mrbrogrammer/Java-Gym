package en.codegym.task.jdk13.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Exceptions
*/

public class Solution {

    public static int i = (int) (Math.random() * 4);

    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            method1();
        }

        //write your code here
        catch (NullPointerException e) {
        }
        catch (FileNotFoundException e) {
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
