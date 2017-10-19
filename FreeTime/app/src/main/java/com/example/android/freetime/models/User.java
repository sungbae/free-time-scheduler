package com.example.android.freetime.models;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by sungbae on 10/15/17.
 */

public class User {

    @DatabaseField(generatedId = true)
    private int UserID;

    @DatabaseField
    private String FirstName;

    @DatabaseField
    private String LastName;

    @DatabaseField
    private String Email;

    public User() {
        // This is needed for OrmLite
    }

    public User(String firstName, String lastName, String email) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
    }

    public int getUserID() {
        return UserID;
    }

    // Look in to removing because of auto generated ID's
    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
