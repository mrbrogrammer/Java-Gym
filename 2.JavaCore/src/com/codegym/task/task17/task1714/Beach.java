package com.codegym.task.task17.task1714;

/* 
Comparable

*/

import java.util.Comparator;
import java.util.Map;

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {
    }
    
    
    public synchronized int compareTo(Beach o) {
    
        float f1 = Float.compare(this.distance, o.distance);
        float f2 = Float.compare(this.quality, o.quality);
        
        return Float.compare(f1, f2);

    }
}
