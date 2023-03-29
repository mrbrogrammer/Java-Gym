package com.codegym.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName

UnsupportedFileName
Change the TxtInputStream class so that it only works with txt files (* .txt).
For example, first.txt or name.1.part3.txt.
If a non-txt file is passed (e.g. file.txt.exe), then the constructor should throw
an UnsupportedFileNameException.
Think about what else you need to do if an exception is thrown.


Requirements:
1. The TxtInputStream class must inherit the FileInputStream class.
2. If a txt file is passed to the constructor, TxtInputStream should behave like a regular FileInputStream.
3. If a non-txt file is passed to the constructor, an UnsupportedFileNameException should be thrown.
4. If an exception is thrown, then you must also call super.close().
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
       
        if (!fileName.endsWith(".txt")) {
            try {
                super.close();
                throw new UnsupportedFileNameException();
            } catch (UnsupportedFileNameException e) {
                throw new UnsupportedFileNameException();
            } finally {
            }
        }
    }

    public static void main(String[] args) {
    }
}

