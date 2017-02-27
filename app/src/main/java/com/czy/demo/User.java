package com.czy.demo;

import android.support.annotation.NonNull;

public class User implements Comparable {

    private String userName;

    private String phone;

    private char headLetter;

    public User(String userName, String phone) {
        this.userName = userName;
        this.phone = phone;
        headLetter = Utils.getHeadChar(userName);
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public char getHeadLetter() {
        return headLetter;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (this == object) {
            return true;
        }
        User that = (User) object;
        return getUserName().equals(that.getUserName()) && getPhone().equals(that.getPhone());
    }

    @Override
    public int compareTo(@NonNull Object object) {
        if (!(object instanceof User)) {
            throw new ClassCastException();
        }
        User that = (User) object;
        if (getHeadLetter() == '#') {
            if (that.getHeadLetter() == '#') {
                return 0;
            }
            return 1;
        }
        if (that.getHeadLetter() == '#') {
            return -1;
        } else if (that.getHeadLetter() > getHeadLetter()) {
            return -1;
        } else if (that.getHeadLetter() == getHeadLetter()) {
            return 0;
        }
        return 1;
    }

}
