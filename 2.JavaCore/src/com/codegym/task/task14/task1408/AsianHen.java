package com.codegym.task.task14.task1408;

class AsianHen extends Hen {
    int monthlyEggCount = 8;
    @Override
    public int getMonthlyEggCount() {
        return this.monthlyEggCount;
    }
    
    @Override
    String getDescription() {
        return
                super.getDescription() +
                " I come from Asia. " + "I lay " +
                getMonthlyEggCount() + " eggs a month.";
    }
}
