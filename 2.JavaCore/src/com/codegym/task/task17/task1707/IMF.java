package com.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    final static IMF instance = new IMF();
    public static IMF getFund() {
        //write your code here
        synchronized (new IMF()) {
            imf = new IMF();
        }
        
        return instance;
    }

    private IMF() {
    }
}
