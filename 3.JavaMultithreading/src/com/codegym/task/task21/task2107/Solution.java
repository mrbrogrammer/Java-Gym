package com.codegym.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Deep cloning of a map

*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(users, solution.users);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
    
    protected Map<String, User> users = new LinkedHashMap();
    
    public Object clone() throws CloneNotSupportedException {
        Solution clone = new Solution();
        clone.users = new LinkedHashMap<>(this.users);
//        if ((this.users.hashCode() == clone.users.hashCode())) throw new CloneNotSupportedException();
        return clone;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
