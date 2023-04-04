package com.codegym.task.task19.task1921;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        return sdf.format(birthDate);
    }
}
