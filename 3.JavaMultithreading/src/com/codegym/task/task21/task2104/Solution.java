package com.codegym.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode

*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (! (o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(last, solution.last) && Objects.equals(first, solution.first);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }
    
    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        
        System.out.println(s.iterator().next().equals(new Solution("Donald", "Duck")));
    }
}
