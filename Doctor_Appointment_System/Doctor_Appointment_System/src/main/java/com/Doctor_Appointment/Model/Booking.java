package com.Doctor_Appointment.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    private int id;

    private int userId;

    private String pickup_location;
    private String dropof_location;
    private int date;
    private int month;
    private int year;
    private int date1;
    private int month1;
    private int year1;
    private String time;

    public Booking() {
    }

    public Booking(int id, int userId, String pickup_location, String dropof_location, int date, int month, int year, int date1, int month1, int year1, String time) {
        this.id = id;
        this.userId = userId;
        this.pickup_location = pickup_location;
        this.dropof_location = dropof_location;
        this.date = date;
        this.month = month;
        this.year = year;
        this.date1 = date1;
        this.month1 = month1;
        this.year1 = year1;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPickup_location() {
        return pickup_location;
    }

    public void setPickup_location(String pickup_location) {
        this.pickup_location = pickup_location;
    }

    public String getDropof_location() {
        return dropof_location;
    }

    public void setDropof_location(String dropof_location) {
        this.dropof_location = dropof_location;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDate1() {
        return date1;
    }

    public void setDate1(int date1) {
        this.date1 = date1;
    }

    public int getMonth1() {
        return month1;
    }

    public void setMonth1(int month1) {
        this.month1 = month1;
    }

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
