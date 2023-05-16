package com.codegym.task.task34.task3412;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/* 
Adding logging to a class

*/

public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    private int value1;
    private String value2;
    private Date value3;

    public Solution(int value1, String value2, Date value3) {
        logger.debug("Values: " + value1 + ", " + value2 + ", " + value3);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {
    }

    public void calculateAndSetValue3(long value) {
        logger.trace("value1 is " + value);
        value -= 133;
        if (value > Integer.MAX_VALUE) {
            value1 = (int) (value / Integer.MAX_VALUE);
            logger.debug("value1 = " + value1);
        } else {
            value1 = (int) value;
            logger.debug("value1 = " + value1);
        }
    }

    public void printString() {
        if (value2 != null) {
            System.out.println(value2.length());
            logger.trace("The String is " + value3.getTime());
        }
//        logger.debug("value2 is " + ("".equals(value2) ? null : value2).toString());
    }

    public void printDateAsLong() {
        if (value3 != null) {
            System.out.println(value3.getTime());
            logger.trace("The time is " + value3.getTime());
        }
//        logger.debug("value3 is " + ("".equals(value3) ? null : value3).toString());
    }

    public void divide(int number1, int number2) {
        logger.trace("Arguments = " + number1 + ", " + number2);
        try {
            System.out.println(number1 / number2);
            
        } catch (ArithmeticException e) {
            logger.error("Incompatible number ", e);
        }
    }

    public void setValue1(int value1) {
//        logger.trace("value1 is now " + this.value1);
        this.value1 = value1;
        logger.debug(this.value1 + " is equal to " + value1 + ": " + String.valueOf(value1).equals(this.value1));
    }

    public void setValue2(String value2) {
//        logger.trace("value2 is now " + this.value2);
        this.value2 = value2;
        logger.debug(this.value2 + " is equal to " + value2 + ": " + this.value2.equals(value2));

    }

    public void setValue3(Date value3) {
//        logger.trace("value3 is now " + this.value3);
        this.value3 = value3;
        logger.debug(this.value3 + " is equal to " + value3 + ": " + this.value3.equals(value3));

    }
}
