package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.*;

/* 
Reading and writing to a file: CodeGym

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("/Users/admin/Downloads/CodeGymTasks/2.JavaCore/src/com/codegym/task/task20/task2002/file1.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);
            
            
            
            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            
            codeGym.save(outputStream);
            outputStream.flush();

            // Here check that the codeGym object is equal to the loadedObject object
            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            
            
//            PrintWriter writer = new PrintWriter(outputStream);
            for(int i = 0; i < this.users.size(); i++) {
                outputStream.write(this.users.get(i).getFirstName().getBytes());
                outputStream.write(this.users.get(i).getFirstName().getBytes());
                outputStream.write((int) this.users.get(i).getBirthDate().getTime());
                outputStream.write((this.users.get(i).isMale() ? "true" : "false").getBytes());
                outputStream.write(this.users.get(i).getCountry().getDisplayName().getBytes());
            }
    
            outputStream.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String string;

            String[] strings;
            while ((string = reader.readLine()) != null) {
                if(string.equals("")) return;
                strings = string.split("~");
                User user = new User();
                user.setFirstName(strings[0]);
                user.setLastName(strings[1]);
                user.setBirthDate(new Date(Long.parseLong(strings[2])));
                user.setMale(Objects.equals(strings[3], "Yes"));
                switch (User.Country.valueOf(strings[4])) {
                    case UNITED_STATES:
                        user.setCountry(User.Country.UNITED_STATES);
                        break;
                    case UNITED_KINGDOM:
                        user.setCountry(User.Country.UNITED_KINGDOM);
                        break;
                    default:
                        user.setCountry(User.Country.OTHER);
                        break;
                }
    
    
                this.users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
