package com.example.coffeetracker;

import androidx.annotation.ColorInt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CoffeeRecords {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name = "brewDate")
    private String brewDate;

    @ColumnInfo(name = "brewMethod")
    private String brewMethod;

    @ColumnInfo(name = "coffeeName")
    private String coffeeName;

    @ColumnInfo(name = "brewTime")
    private String brewTime;

    @ColumnInfo(name = "gramsCoffee")
    private double gramsCoffee;

    @ColumnInfo(name = "calories")
    private double calories;

    @ColumnInfo(name = "rating")
    private double rating;

    @ColumnInfo(name = "comment")
    private String comment;

}
