package com.example.coffeetracker;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CoffeeDao {
    @Query("select * from CoffeeRecords order by brewDate")
    public List<CoffeeRecords> getAll();

    @Insert
    public long insertCoffeeRecords (CoffeeRecords coffeeRecords);

    @Delete
    public void deleteCoffeeRecord(CoffeeRecords coffeeRecords);

}
