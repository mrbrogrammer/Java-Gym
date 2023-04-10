package com.codegym.task.task20.task2021;

import java.io.*;

/* 
Serialization is prohibited

*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        public SubSolution() throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {
    
    }
}
