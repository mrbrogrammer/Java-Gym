package com.codegym.task.task16.task1630;

import java.io.*;

/**
 * Sequential file output
 * 1. Figure out what the program does.
 * 2. In a static block, read 2 filenames: firstFileName and secondFileName.
 * 3. Inside the Solution class, create a public static ReadFileThread class that implements the ReadFileInterface interface (Think about what is more appropriate: Thread or Runnable).
 * 3.1. The setFileName method must set the name of the file whose contents will be read.
 * 3.2. The getFileContents method must return the contents of the file.
 * 3.3. In the run method, read the contents of the file and close the stream. Separate the lines of the file with spaces.
 * 4. Think about where you need to wait for the thread to finish to ensure that the files are displayed sequentially.
 * 4.1. To do this, add a call to the appropriate method.
 *
 * Expected output:
 * [entire contents of the first file]
 * [entire contents of the second file]
 *
 *
 * Requirements:
 * 1. The Solution class's static block should read from the console the names of two files and store them in the variables firstFileName and secondFileName.
 * 2. In the Solution class, declare the public static ReadFileThread class.
 * 3. The ReadFileThread class must implement the ReadFileInterface interface.
 * 4. The ReadFileThread class must inherit the appropriate class.
 * 5. The ReadFileThread class's run method should read lines from the file set by the setFileName method. And the getFileContents method of this same class must return the file contents. The return value is one string consisting of the lines of the file, separated by spaces.
 * 6. The systemOutPrintln method must call the join method on the created object f.
 * 7. The program's output should consist of 2 lines. Each line contains the contents of one file.
 */

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    
    //write your code here
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //write your code here
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface extends Runnable {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //write your code here
    public static class ReadFileThread extends Thread implements ReadFileInterface{
    
        private String fileName;
        
        private String fileContents = "";
        
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }
    
        @Override
        public String getFileContents() {
            return fileContents;
        }
    
        @Override
        public void start() {
            run();
        }
    
        @Override
        public void run() {
            FileInputStream inStream = null;
            try {
                inStream = new FileInputStream(fileName);
        
                while (inStream.available() > 0) {
                    char s = (char) inStream.read();
            
                    if ('\n' == s){
                        s = ' ';
                    }
            
                    fileContents += s;
                }
                
                inStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(("File not found " + fileName));
        
            } catch (IOException ignored) {
            }
        }
    }
}
