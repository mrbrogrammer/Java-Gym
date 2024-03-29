package com.codegym.task.task31.task3104;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.zip.ZipOutputStream;

/* 
Search for hidden files

*/

public class Solution extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        final Solution solution = new Solution();
        Files.walkFileTree(Paths.get("D:/"), options, 20, solution);

        List<String> result = solution.getArchived();
        System.out.println("All archived files:");
        for (String path : result) {
            System.out.println("\t" + path);
        }

        List<String> failed = solution.getFailed();
        System.out.println("All failed files:");
        for (String path : failed) {
            System.out.println("\t" + path);
        }
    }

    private List<String> archived = new ArrayList<>();
    private List<String> failed = new ArrayList<>();

    public List<String> getArchived() {
        return archived;
    }

    public List<String> getFailed() {
        return failed;
    }
    
    /**
     * @param file  a reference to the file
     * @param attrs the file's basic attributes
     * @return
     * @throws IOException
     */
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        ZipOutputStream zip = new ZipOutputStream(Files.newOutputStream(Paths.get("D:/mydir/BCD.zip")));
    
//        Files.copy(file, zip);
        archived.add(file.toString());
        
//        zip.close();
        
        return super.visitFile(file, attrs);
    }
    
    /**
     * @param file a reference to the file
     * @param exc  the I/O exception that prevented the file from being visited
     * @return
     * @throws IOException
     */
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        
        failed.add(file.toString());
        return FileVisitResult.SKIP_SUBTREE;
    }
}
