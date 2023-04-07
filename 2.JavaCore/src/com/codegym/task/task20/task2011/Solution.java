package com.codegym.task.task20.task2011;

/* 
Externalizable for apartments

*/

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            // deserialize member fields
            out.writeObject(address);
            out.writeInt(year);
        }
    
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            // serialize member fields
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) {

    }
}
