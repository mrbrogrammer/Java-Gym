package com.codegym.task.task19.task1904;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;

    public Person(String lastName, String firstName, String middleName, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        return String.format("%s %s %s %s", firstName, middleName, lastName, birthDate);
    }
}
