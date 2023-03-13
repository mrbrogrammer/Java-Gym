package com.codegym.task.task14.task1408;

class EuropeanHen extends Hen {
    int monthlyEggCount = 2;
    
    @Override
    public int getMonthlyEggCount() {
        return this.monthlyEggCount;
    }
    
    @Override
    String getDescription() {
        return
                super.getDescription() +
                " I come from Europe. " + "I lay " +
                getMonthlyEggCount() + " eggs a month.";
    }
}
