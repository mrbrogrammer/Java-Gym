package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        
        while (true) {
            inputStream = new FileInputStream(bufferedReader.readLine());
            int count = inputStream.available();
    
            if (count < 1000) {
                inputStream.close();
                throw new DownloadException();
            }
            
        }
    }

    public static class DownloadException extends Exception {

    }
}
