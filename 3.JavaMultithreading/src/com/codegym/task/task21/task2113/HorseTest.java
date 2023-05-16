package com.codegym.task.task21.task2113;

import org.junit.*;

class HorseTest {
    
    @Test
    void move() {
        Horse horse = new Horse("Stallion", 3, 0);
        
        
        Assert.assertEquals(horse.getDistance(), 0);
        
    }
    @Test
    void print() {
    }
}