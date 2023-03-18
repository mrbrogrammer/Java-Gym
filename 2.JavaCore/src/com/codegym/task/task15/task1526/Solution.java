package com.codegym.task.task15.task1526;

/* 
Debug, debug, and again debug

*/

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        protected int f1;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        static {
        }
        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }
}
