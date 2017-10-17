package com.example.android.freetime.dao;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by sungbae on 10/16/17.
 */

public class User {

    @DatabaseField(generatedId = true)
    public int UserId;

    @DatabaseField
    public String FirstName;

    @DatabaseField
    public String LastName;

    @DatabaseField
    public String Email;

    User() {
        // This is needed for OrmLite
    }
}
