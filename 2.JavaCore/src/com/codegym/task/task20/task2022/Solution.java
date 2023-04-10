package com.codegym.task.task20.task2022;

import java.io.*;

/* 
Overriding serialization in a thread

*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    public String fileName;
    
    public Solution(String fileName, boolean isClosed) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName, isClosed);
    }

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws Exception {
        out.defaultWriteObject();
        close();
    }

    /**
     * 4. In the readObject(ObjectInputStream in) method,
     * the stream field must be initialized with a new FileOutputStream object using the arguments (fileName, true).
     * */
    private void readObject(ObjectInputStream in) throws Exception {
        this.stream = new FileOutputStream(fileName, true);
        in.defaultReadObject();
        close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {

    }
}
