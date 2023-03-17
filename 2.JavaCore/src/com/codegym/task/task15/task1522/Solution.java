package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) throws IOException {
    }
    public static Planet thePlanet;

    // Add static block here
    static {
        thePlanet = null;
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            String string = reader.readLine();
    
            switch (string){
                case Planet.EARTH:
                    thePlanet = Earth.getInstance();
                    break;
                case Planet.SUN:
                    thePlanet = Sun.getInstance();
                    break;
                case Planet.MOON:
                    thePlanet = Moon.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        
    }
}
