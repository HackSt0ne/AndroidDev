package com.example.select.model;

public class Person {
    private String mName;
    private boolean mGender;

    public Person(String mName, boolean mGender) {
        this.mName = mName;
        this.mGender = mGender;
    }

    public Person()
    {
        this.mName = "test";
        this.mGender = true;
    }

    public String getmName() {
        return mName;
    }

    public boolean ismGender() {
        return mGender;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmGender(boolean mGender) {
        this.mGender = mGender;
    }
}
