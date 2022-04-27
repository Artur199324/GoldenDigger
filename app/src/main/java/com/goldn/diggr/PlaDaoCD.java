package com.goldn.diggr;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PlaDaoCD {

    @Insert
    void placd(PlaCD plaCD);

    @Query("SELECT * FROM playerCD ORDER BY ID DESC LIMIT 1")
    PlaCD getPlaCD();
}
