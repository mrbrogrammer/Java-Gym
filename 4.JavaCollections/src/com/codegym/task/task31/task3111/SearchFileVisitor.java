package com.codegym.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();
    
    
    public String getPartOfName() {
        return partOfName;
    }
    
    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }
    
    public String getPartOfContent() {
        return partOfContent;
    }
    
    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }
    
    public int getMinSize() {
        return minSize;
    }
    
    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file);
        String text = new String(content);
    
    
        boolean minSize = false;
        boolean maxSize = false;
        boolean partOfName = false;
        boolean partOfContent = false;
        
//        if ((this.partOfName == null || this.partOfName.equals("")) && (this.partOfContent == null || this.partOfContent.equals("")) &&  this.maxSize == 0 && this.minSize == 0) {
//            return FileVisitResult.CONTINUE;
//        }
    
//        if (this.partOfName != null && !file.getFileName().toString().contains(this.partOfName) || this.partOfContent != null && !file.getFileName().toString().contains(this.partOfContent))
//            return FileVisitResult.CONTINUE;
        
        if (this.partOfName != null || this.partOfName.contains(String.valueOf(file.getFileName()))) partOfName = true;
        
        if (this.partOfContent != null && text.contains(this.partOfContent)) {
                partOfContent = true;
        }
        
        if (this.maxSize != 0 || this.maxSize > content.length) maxSize = true;
        if (this.minSize < content.length || this.minSize != 0) minSize = true;
        
        if (maxSize && minSize && partOfContent && partOfName) foundFiles.add(file);
        
        return super.visitFile(file, attrs);
    }
    
    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }
}
