package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        if (imageType == null){
            throw new IllegalArgumentException("Unknown image type");
            
        } else {
    
            switch (imageType) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                default:
                    return new PngReader();
            }
        }
    }
}
