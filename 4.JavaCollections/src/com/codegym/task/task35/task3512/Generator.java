package com.codegym.task.task35.task3512;

public class Generator<T> {
    
    Class<T> instance;
    
    public Generator(Class<T> eventClass) {
        this.instance = eventClass;
    }
    
    T newInstance() throws InstantiationException, IllegalAccessException {
        return instance.newInstance();
    }
}
