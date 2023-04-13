package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) {
        
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Stallion", 3, 0));
        game.getHorses().add(new Horse("Racer", 3, 0));
        game.getHorses().add(new Horse("Ivy", 3, 0));
        
        
    }
    private List<Horse> horses;
    
    static Hippodrome game;
    
    public List<Horse> getHorses() {
        return horses;
    }
    
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
    
    
    public void run() throws InterruptedException {
        // Make a loop from 1 to 100 in the run method
        for (int i = 0; i < 100; i++) {
            horses.forEach(x -> x.print());
            Thread.sleep(200);
        }
    
    }
    
    public void move() {
        horses.forEach(Horse::move);
    }
    
    public void print() {
    }
    
}
