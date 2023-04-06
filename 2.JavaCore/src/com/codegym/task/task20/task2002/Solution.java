package com.codegym.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
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
            PrintStream out = new PrintStream(outputStream);
            if (users.size() == 0) {
//                out.print("null");
            }
            else {
                if (users.size() > 0) {
                    User temp = users.get(0);
                    String firstName = temp.getFirstName();
                    String lastName = temp.getLastName();
                    String birthday = temp.getBirthDate().toString();
                    String sex = temp.isMale() ? "true" : "false";
                    String country = temp.getCountry().toString();
                    out.print(firstName + "," + lastName + "," + birthday + "," + sex + "," + country);
                    for (int i = 1; i < users.size(); i++) {
                        temp = users.get(i);
                        firstName = temp.getFirstName();
                        lastName = temp.getLastName();
                        birthday = temp.getBirthDate().toString();
                        sex = temp.isMale() ? "true" : "false";
                        country = temp.getCountry().toString();
                        out.print("\n" + firstName + "," + lastName + "," + birthday + "," + sex + "," + country);
                    }
                }
            }
            out.close();
        }
    
        public void load(InputStream inputStream) throws Exception {
            BufferedReader bR = new BufferedReader(new InputStreamReader(inputStream));
            String in;
            while ((in = bR.readLine()) != null) {
                String[] inStrings = in.split(",");
                String firstName = inStrings[0];
                String lastName = inStrings[1];
                String birthday = inStrings[2];
                String sex = inStrings[3];
                String country = inStrings[4];
            
                User user = new User();
            
                //Name
                user.setFirstName(firstName);
                user.setLastName(lastName);
            
                //Birthday
                SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                Date parsedDate = formatter.parse(birthday);
                user.setBirthDate(parsedDate);
            
                //Sex
                if (sex.equals("true")) {
                    user.setMale(true);
                }
                else {
                    user.setMale(false);
                }
            
                //country
                user.setCountry(User.Country.valueOf(country));
    
                users.add(user);
    
            }
            bR.close();
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
