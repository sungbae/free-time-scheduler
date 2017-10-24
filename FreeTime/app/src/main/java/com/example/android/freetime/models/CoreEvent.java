package com.example.android.freetime.models;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by Justin on 10/19/2017.
 */

public class CoreEvent {
    @DatabaseField(generatedId = true)
    private int CoreEventId;

    @DatabaseField
    private String Title;

    @DatabaseField
    private String Description;

    @DatabaseField
    private String Location;

    @DatabaseField
    private String TimeStart;

    @DatabaseField
    private String TimeEnd;

    public CoreEvent(){

    }

    public CoreEvent(String title, String description, String location, String timeStart, String timeEnd) {
        this.Title = title;
        this.Description = description;
        this.Location = location;
        this.TimeStart = timeStart;
        this.TimeEnd = timeEnd;
    }

    public int getCoreEventId() {
        return CoreEventId;
    }

    // Look in to removing, because ID's are auto generated
    public void setCoreEventId(int coreEventId) {
        CoreEventId = coreEventId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public void setTimeStart(String timeStart) {
        TimeStart = timeStart;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        TimeEnd = timeEnd;
    }
}
