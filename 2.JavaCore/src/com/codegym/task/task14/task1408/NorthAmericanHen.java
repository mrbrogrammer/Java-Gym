package com.codegym.task.task14.task1408;

class NorthAmericanHen extends Hen {
    int monthlyEggCount = 4;
    
    @Override
    public int getMonthlyEggCount() {
        return this.monthlyEggCount;
    }

    @Override
    String getDescription() {
        return
                super.getDescription() +
                " I come from North America. " + "I lay " +
                getMonthlyEggCount() + " eggs a month.";
    }
}
