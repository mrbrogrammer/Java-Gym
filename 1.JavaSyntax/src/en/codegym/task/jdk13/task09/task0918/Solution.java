package en.codegym.task.jdk13.task09.task0918;

/* 
Creating your own exceptions
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends IOException {
    }

    static class MyException3 extends StackOverflowError {
    }

    static class MyException4 extends ArithmeticException {
    }
}

