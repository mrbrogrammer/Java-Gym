package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read several keys (strings) from the console. Item 7
    
        BufferedReader reader = null;
        String key;
        
        String[] VALID_KEYS = {"cartoon", "soapOpera","thriller"};
    
        /*
            8. Create a variable movie in the Movie class, and for each entered string (key):
            8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
            8.2. Display the result of calling movie.getClass().getSimpleName().
        */
        
        try {
    
            reader = new BufferedReader(new InputStreamReader(System.in));
    
            do {
                key = reader.readLine();
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            } while (Arrays.binarySearch(VALID_KEYS, key) >= 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera object for the key "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            
            return movie;
        }
    }

    static class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // Write your classes here. Item 3
    
    static class Cartoon extends Movie {
    }
    
    static class Thriller extends Movie {
    }
}
