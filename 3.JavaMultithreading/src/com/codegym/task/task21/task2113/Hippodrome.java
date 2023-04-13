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
    
}
