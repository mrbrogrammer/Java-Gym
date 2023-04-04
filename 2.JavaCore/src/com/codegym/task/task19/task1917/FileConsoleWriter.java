package com.codegym.task.task19.task1917;

/* 
Your own FileWriter

*/

import java.io.*;

public class FileConsoleWriter {
    private FileWriter fileWriter;
    
    public FileConsoleWriter(FileDescriptor fileDescriptor) throws IOException {
        fileWriter = new FileWriter(fileDescriptor);
    }
    
    public FileConsoleWriter(String s) throws IOException {
        fileWriter = new FileWriter(s);
        
    }
    
    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }
    
    public FileConsoleWriter(String s, boolean append) throws IOException {
        fileWriter = new FileWriter(s, append);
    }
    
    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.print(new String(cbuf).substring(off, off + len));
        
    }
    
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println((char) c);
        
    }
    
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
        
    }
    
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
        
    }
    
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++) {
            System.out.print(cbuf[i]);
        }
    }
    
    public void close() throws IOException {
        fileWriter.close();
        
    }
    
    public static void main(String[] args) throws IOException {
    
    }
    
}
