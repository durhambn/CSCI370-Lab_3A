package com.introtoandroid.lab3a;

public class Student {
    private String firstName;
    private String lastName;
    private String major;


    public Student() {}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
