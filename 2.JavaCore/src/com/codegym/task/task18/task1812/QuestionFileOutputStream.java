package com.codegym.task.task18.task1812;

import java.io.*;
import java.util.stream.Stream;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    
    private AmigoOutputStream original;
    public QuestionFileOutputStream(AmigoOutputStream o) {
        this.original = o;
    }
    
    @Override
    public void flush() throws IOException {
        original.flush(); // this is delegated to the AmigoOutputStream object
    }
    
    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }
    
    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }
    
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }
    
    @Override
    public void close() throws IOException {
    
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Do you really want to close the stream? Y/N");
        String shouldClose = bufferedReader.readLine();
 
        if (shouldClose.equals("Y")) original.close();
        
    }
}

