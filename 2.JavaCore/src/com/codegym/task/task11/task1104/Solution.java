package com.codegym.task.task11.task1104;

/* 
Hard workers

*/

import java.io.StringReader;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Employee employee = new CEO("Simon");
        System.out.println(employee.name);
    }

    public static class Manager extends Employee {
    
    }

    public static class CEO extends Employee {
        public CEO(String name) {
            this.name = name;
        }
    }

    public static class Employee {
        String name;
        
        Employee(){
            this.name = "None";
        }
    }

    public static class Secretary extends Employee {

    }
}
