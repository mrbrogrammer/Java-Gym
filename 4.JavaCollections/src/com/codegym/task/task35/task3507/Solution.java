package com.codegym.task.task35.task3507;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
What is ClassLoader?

*/

public class Solution extends ClassLoader {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        
        Set<Animal> resultSet = new HashSet<>();
        File folder = new File(pathToAnimals);
        
        if (folder.isDirectory()) {
            try {
                for (File file : Objects.requireNonNull(folder.listFiles())) {
                    if (file.getName().endsWith(".class") && file.isFile()) {
//                        URLClassLoader classLoader = new URLClassLoader(new URL[]{ new URL(file.getAbsolutePath())});
                        String packageName = Solution.class.getPackage().getName() + ".data";
                        Class<?> testClass = new ClassFromPath().load(file.toPath(), packageName);
                        
                        int count = 0;
                        Class<?>[] interfaces = testClass.getInterfaces();
    
                        for (Class<?> value : interfaces){
                            System.out.println(value);
                            if (value.getSimpleName().equals("Animal")) {
                                count++;
                                break;
                            }
                        }
    
    
                        Constructor<?>[] constructors = testClass.getConstructors();
                        for (Constructor<?> value : constructors) {
                            System.out.println(value);
                            if (value.getParameterCount() == 0) {
                                count++;
                            }
                        }
    
                        if (count == 2 ) {
    
                            try {
                                Animal animal = (Animal) testClass.newInstance();
                                resultSet.add(animal);
                            } catch (InstantiationException | IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                   
                    }
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultSet;
    }
    
    public static class ClassFromPath extends ClassLoader {
        public Class<?> load(Path path, String packageName) {
            try {
                String className = packageName + "." + path.getFileName().toString().replace(".class", "");
                byte[] bytes = Files.readAllBytes(path);
                return defineClass(className, bytes, 0, bytes.length);
            } catch (IOException | ClassFormatError e) {
                throw new RuntimeException(e);
            }
        }
    }
}
