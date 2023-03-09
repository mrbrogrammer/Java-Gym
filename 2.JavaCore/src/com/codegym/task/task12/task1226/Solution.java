package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun {
        @Override
        public void climb() {
        
        }
    
        @Override
        public void run() {
        
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
        
        }
    }

    public class Tiger extends Cat {
        @Override
        public void climb() {
        
        }
    
        @Override
        public void run() {
        
        }
    }

    public class Duck implements CanRun, CanFly{
        @Override
        public void fly() {
        
        }
    
        @Override
        public void run() {
        
        }
    }
    
    public interface CanFly {
        void fly();
    }
    
    public interface CanClimb {
        void climb();
    }
    
    public interface CanRun {
        void run();
    }
}
