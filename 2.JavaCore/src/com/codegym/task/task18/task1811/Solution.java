package com.codegym.task.task18.task1811;

/* 
Wrapper (Decorator)

*/

public class Solution {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.print("DecoratorRunnableImpl body ");
            component.run();
        }
    }
    
    public static class DecoratorMyRunnableImpl implements Runnable {
        
        private Runnable original;
        public DecoratorMyRunnableImpl(Runnable o) {
            this.original = o;
        }
    
        @Override
        public void run() {
            System.out.print(this.getClass().getSimpleName() + " body ");
            original.run();
        }
    }
}
