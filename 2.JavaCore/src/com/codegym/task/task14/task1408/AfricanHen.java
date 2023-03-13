package com.codegym.task.task14.task1408;

class AfricanHen extends Hen {
    int monthlyEggCount = 10;
    @Override
    public int getMonthlyEggCount() {
        return this.monthlyEggCount;
    }
    
    @Override
    String getDescription() {
        return
                super.getDescription() +
                " I come from Africa. " + "I lay " +
                getMonthlyEggCount() + " eggs a month.";
    }
}

