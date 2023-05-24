package com.codegym.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
File downloader

*/

public class Solution {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path passwords = downloadFile("https://codegym.cc/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));
        
        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException, URISyntaxException {
        // Implement this method
        URL url = new URL(urlString);
        System.out.println(url.getPath());
        InputStream inStream = url.openStream();

        String[] strings = urlString.split("/");
        String[] filename = strings[strings.length - 1].split("\\.");
        String name = filename[0];
        String extension = "." + filename[1];

        Path tempFile = Files.createTempFile(name + "-", ".tmp");
        Files.copy(inStream, tempFile);
        return Files.move(tempFile, downloadDirectory.resolve(name+extension));
    }
}
