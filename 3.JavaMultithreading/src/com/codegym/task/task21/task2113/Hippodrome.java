package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Stallion", 3, 0));
        game.getHorses().add(new Horse("Racer", 3, 0));
        game.getHorses().add(new Horse("Ivy", 3, 0));
        
        game.run();
        game.printWinner();
        
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
            move();
            print();
            Thread.sleep(200);
        }
    
    }
    
    public void move() {
        horses.forEach(Horse::move);
    }
    
    public void print() {
    
        horses.forEach(Horse::print);
        System.out.println("\n\n\n\n\n\n\n\n\n");
    
    
    }
    
    public Horse getWinner() {
        for (int i = 0; i < horses.size(); i++) {
            for (int j = 0; j < horses.size(); j++) {
                if (horses.get(i).distance > horses.get(j).distance) {
                    Horse tmp = horses.get(i);
                    horses.set(i, horses.get(j));
                    horses.set(j, tmp);
                }
            }
        }
        return horses.get(0);
    }
    
    public void printWinner() {
        System.out.println("The winner is " + getWinner().name + "!");
    }
    
}
