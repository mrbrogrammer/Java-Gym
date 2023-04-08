package com.codegym.task.task20.task2014;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    
        OutputStream outStream = Files.newOutputStream(Paths.get("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2014/test.txt"));
        InputStream inStream = Files.newInputStream(Paths.get("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2014/test2.txt"));
        
        Solution solution = new Solution(2);
        ByteArrayOutputStream byteArrayOutputStream = serialize(solution);
    
        Solution solution1 = deserialize(byteArrayOutputStream);
        outStream.write(solution1.string.getBytes());
    
        Solution solution2 = new Solution(2);
        
        
        byte[] buffer = new byte[inStream.available()];
        int i = 0;
        while (inStream.available() > 0) {
            byte s = (byte) inStream.read(buffer);
            buffer[i] = s;
        }
        
        
        
//        ByteArrayInputStream byteArrayInputStream = serialize(solution2);

//        System.out.println("solution1.string = " + solution1.string);
//        solution1.string
//        solution.writeExternal(outStream);
        
        outStream.close();
        inStream.close();
        System.out.println(new Solution(4));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
    
    public static ByteArrayOutputStream serialize(Solution instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(instance);
        oos.close();
        
        return byteArrayOutputStream;
    }
    
    public static Solution deserialize(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        
        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Solution solution = (Solution) ois.readObject();
        ois.close();
        
        return solution;
    }
    
}
