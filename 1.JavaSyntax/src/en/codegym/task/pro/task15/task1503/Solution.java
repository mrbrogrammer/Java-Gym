package en.codegym.task.pro.task15.task1503;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
There are a lot of resources
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (
                Scanner scanner = new Scanner(System.in);
                BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(scanner.nextLine()));
                ) {
           
            String line = "something else";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println(e);
        }
    }
}

