package com.codegym.task.task20.task2004;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Reading and writing static fields to a file

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {

            File yourFile = File.createTempFile("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2004/file.txt", null);
            OutputStream outputStream = Files.newOutputStream(Paths.get("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2004/file2.txt"));
            InputStream inputStream = Files.newInputStream(Paths.get("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2004/file.txt"));

//            ClassWithStatic classWithStatic = new ClassWithStatic();
//            classWithStatic.i = 3;
//            classWithStatic.j = 4;
//            classWithStatic.save(outputStream);
//            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            loadedObject.save(outputStream);
            // Here check that the classWithStatic object is equal to the loadedObject object
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter writer = new PrintWriter(outputStream);
            writer.write(staticString + "\n");
            writer.write(String.valueOf(i) + "\n");
            writer.write(String.valueOf(j)  + "\n");
            writer.flush();
            writer.close();
            
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader re = new BufferedReader(new InputStreamReader(inputStream));
            if (re.ready()) {
                System.out.println("here");
                staticString = re.readLine();
                i = Integer.parseInt(re.readLine());
                j = Integer.parseInt(re.readLine());
            }
            
            re.close();
            
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
