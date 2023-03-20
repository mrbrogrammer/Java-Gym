package com.codegym.task.task15.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup(); // select a suitable cup

    abstract void addIngredients(); // select a suitable cup

    abstract void pour(); //pour liquid
    
    void makeDrink() { // drink factory (DrinkFactory)
        getRightCup();
        addIngredients();
        pour();
    }
    
}
