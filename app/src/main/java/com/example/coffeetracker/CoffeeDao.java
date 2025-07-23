package com.example.coffeetracker;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public interface CoffeeDao {
    @Query("select * from CoffeeRecords order by Date")
    public List<CoffeeRecords> getAll();
}
