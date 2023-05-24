package com.codegym.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
File downloader

*/


public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://codegym.cc/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // Implement this method
        URL url = new URL(urlString);
        InputStream inStream = url.openStream();
        
        Path tempFile = Files.createTempFile("secretPasswords", ".txt");
        Files.copy(inStream, tempFile);
        
        
        
        
        return null;
    }
}
