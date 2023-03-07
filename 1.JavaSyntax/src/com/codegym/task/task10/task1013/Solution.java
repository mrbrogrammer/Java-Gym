package com.codegym.task.task10.task1013;

/*
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private int age;
        private long mobileNumber;
        private double height;
        private short weight;
        private boolean gender;
    
        public Human(String name, int age, long mobileNumber, double height, short weight, boolean gender) {
            this.name = name;
            this.age = age;
            this.mobileNumber = mobileNumber;
            this.height = height;
            this.weight = weight;
            this.gender = gender;
        }
    
        public Human(String name) {
            this.name = name;
        }
    
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public Human(String name, int age, long mobileNumber) {
            this.name = name;
            this.age = age;
            this.mobileNumber = mobileNumber;
        }
    
        public Human(String name, int age, long mobileNumber, double height) {
            this.name = name;
            this.age = age;
            this.mobileNumber = mobileNumber;
            this.height = height;
        }
    
        public Human(String name, int age, long mobileNumber, double height, short weight) {
            this.name = name;
            this.age = age;
            this.mobileNumber = mobileNumber;
            this.height = height;
            this.weight = weight;
        }
    
        public Human(double height, short weight) {
            this.height = height;
            this.weight = weight;
        }
    
        public Human(String name, int age, boolean gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    
        public Human(double height, short weight, boolean gender) {
            this.height = height;
            this.weight = weight;
            this.gender = gender;
        }
    
        public Human(long mobileNumber) {
            this.mobileNumber = mobileNumber;
        }
    }
}
