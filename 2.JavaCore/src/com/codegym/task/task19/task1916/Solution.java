package com.codegym.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        BufferedReader file1InStream = new BufferedReader(new FileReader("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task19/task1916/file1.txt"));
        BufferedReader file2InStream = new BufferedReader(new FileReader("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task19/task1916/file2.txt"));
    
        List<String> file1 = new ArrayList<>();
        while (file1InStream.ready()) {
            String line = file1InStream.readLine();
            file1.add(line);
        }
        
        List<String> file2 = new ArrayList<>();
        while (file2InStream.ready()) {
            String line = file2InStream.readLine();
            file2.add(line);
        }
        
        int size = file1.size();
        if (file1.size() < file2.size()) size = file2.size();
    
        for (int i1 = 0, i2 = 0; i1 < file2.size();) {
            
            if (file1.get(i1).hashCode() == file2.get(i2).hashCode()) {
                LineItem item = new LineItem(Type.SAME, Type.SAME + " " + file1.get(i1));
                lines.add(item);
                System.out.println("same");
//                continue;
            } else {
    
//                int t = Arrays.binarySearch(file2.toArray(), file1.get(i1));
//
//                System.out.println(t);
    
                int countRemove = 0;
                int countAdded = 0;
                for (int j = 0; j < file2.size(); j++) {
                    if (file1.get(i1).hashCode() == file2.get(j).hashCode()) {
                        countRemove++;
                    }
                }
    
                if (countRemove > 0) {
                } else {
                    LineItem item = new LineItem(Type.REMOVED, Type.REMOVED + " " + file1.get(i1));
                    System.out.println("removed");
                    lines.add(item);
                }
                for (int k = 0; k < file1.size(); k++) {
                    if (file2.get(i2).hashCode() == file1.get(k).hashCode()) {
                        countAdded++;
                    }
                }
                
                if (countAdded > 0) {
                
                } else {
                    LineItem item = new LineItem(Type.ADDED, Type.ADDED + " " + file2.get(i1));
                    System.out.println("added");
                    lines.add(item);
                    i1--;
                }
                
            }
            i1++;
            i2++;
        }
        
        
        
        
//        for (int index = 0; index < file1.size(); index++) {
//            try {
//                if (file1.get(index).hashCode() == file2.get(index).hashCode()) {
//                    LineItem item = new LineItem(Type.SAME, Type.SAME + " " + file1.get(index));
//                    lines.add(item);
//                } else {
//                    LineItem item = new LineItem(Type.REMOVED, Type.REMOVED + " " + file1.get(index));
//                    lines.add(item);
//                }
//            } catch (IndexOutOfBoundsException e) {
//                LineItem item = new LineItem(Type.REMOVED, Type.REMOVED + " " +  file1.get(index));
//                lines.add(item);
//            }
//        }
//
//        for (int index = 0; index < file2.size(); index++) {
//            try {
//                if (file2.get(index).hashCode() != file1.get(index).hashCode()) {
//                    LineItem item = new LineItem(Type.ADDED, Type.ADDED + " " +  file2.get(index));
//                    lines.add(item);
//                }
//            } catch (IndexOutOfBoundsException e) {
//                LineItem item = new LineItem(Type.ADDED,Type.ADDED + " " + file2.get(index));
//                lines.add(item);
//            }
//        }
    
        for (LineItem pair : lines) {
            System.out.println(pair.line);
        }
    
        bufferedReader.close();
        file1InStream.close();
        file2InStream.close();
//        System.out.println(lines.get(0).line);
//        System.out.println(lines.get(0).type);
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
