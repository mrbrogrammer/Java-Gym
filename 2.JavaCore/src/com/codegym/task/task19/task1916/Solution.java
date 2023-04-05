package com.codegym.task.task19.task1916;

import java.io.*;
import java.util.*;

/* 
Tracking changes

*/

public class Solution {
    static boolean debug = false; // debug mode true = on; false = off
    
    public static List<LineItem> lines = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        String[] fileNames = new String[2];
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        fileNames[0] = userInput.readLine();
        fileNames[1] = userInput.readLine();
        userInput.close();
        
        
        //declare array lists to hold each files contents
        ArrayList<String> fileOneContents = getContents(fileNames[0]), fileTwoContents = getContents(fileNames[1]);
        //if(debug) System.out.println(fileOneContents + "\n" + fileTwoContents);
        
        //creates LinkedHashMap and delegates sorting to method
        LinkedHashMap<String,Type> orderedResults = sortFileContents(fileOneContents, fileTwoContents);
    
        if (debug) for(Map.Entry<String, Type> pair : orderedResults.entrySet()) System.out.println(pair.getValue() + " : " + pair.getKey());
        
        //adds each item from linkedhashmap to static list: lines
        for(Map.Entry<String,Type> pair : orderedResults.entrySet()){
            lines.add(new LineItem(pair.getValue(), pair.getKey()));
        }
    
        if(debug) {
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i).type + " " + lines.get(i).line);
            }
        }
//        System.out.println(lines.get(0).type);
//        System.out.println(lines.get(0).line);
    }
        
        // orders the file content's passed to it and tags each line as same, added, removed; adds them to linkedhashmap which is returned
        private static LinkedHashMap<String, Type> sortFileContents(ArrayList<String> fileOneContents, ArrayList<String> fileTwoContents) {
            LinkedHashMap<String, Type> returnValues = new LinkedHashMap<>();
            ArrayList<String> order;
            
            // initializes first values of the order: adds SAME and REMOVED
            order = getStartingOrder(fileOneContents, fileTwoContents);
            
            // enter all lines to be added in correct order
            addInsterts(order, fileOneContents, fileTwoContents);
            
            // enters everything into the linked hash map
            for(String x : order){
                Type type = null;
                String[] values = x.split("亦");
                
                switch (values[0]){
                    case "ADDED":
                        type = Type.ADDED;
                        break;
                    case "REMOVED":
                        type = Type.REMOVED;
                        break;
                    case "SAME":
                        type = Type.SAME;
                        break;
                    default:
                        break;
                }
                returnValues.put(values[1],type);
            }
            
            return returnValues;
        }
        
        // adds in all new lines of code at the index 1 after the last SAME, accounts for REMOVE
        private static void addInsterts(ArrayList<String> order, ArrayList<String> StartingFile, ArrayList<String> updatedFile) {
            int index = 0;
            
            //iterates through each line of the updated file
            for(int i = 0; i < updatedFile.size();i++){
                
                // step one, check if the line is contained, increases index number if true
                if(StartingFile.contains(updatedFile.get(i)))
                    index++;
                else{
                    // step 2 if 1 is false: adds line at element index, increases index, or if index is past size, puts it at the end
                    if(index != order.size()){
                        order.add(index, "ADDED"+"亦"+updatedFile.get(i));
                        index++;
                    }else{
                        order.add("ADDED"+"亦"+updatedFile.get(i));
//                        index++; //keeps it at the end
                    }
                }
                
                // increases index if a REMOVE is found
                if(index != order.size() && order.get(index).contains("REMOVED"))
                    index++;
            }
        }
        
        //Starts the ordered array with all the lines from the first file, checks if they are the same or need to be removed
        private static ArrayList<String> getStartingOrder(ArrayList<String> StartingFile, ArrayList<String> updatedFile) {
            ArrayList<String> order = new ArrayList<>();
            
            //foreach string in the first file passed to it, use a chinese character so that i can split type from line later on
            for (String x: StartingFile){
                if(updatedFile.contains(x)) order.add("SAME"+"亦"+x);
                else order.add("REMOVED"+ "亦" + x);
            }
            return order;
        }
        
        //reads the file from the file name passed to it, returns a string arraylist of each line
        private static ArrayList<String> getContents(String fileName) throws IOException {
            ArrayList<String> returnValues = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while(reader.ready()) returnValues.add(reader.readLine());
            reader.close();
            return returnValues;
        }
    
    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }
    
    public static class LineItem {
        public Type type;
        public String line;
        
        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
