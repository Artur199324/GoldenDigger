package com.goldn.diggr;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {PlaCD.class},version = 1)
public abstract class PlaDataBaseGD extends RoomDatabase {
    public abstract PlaDaoCD plaDaoCD();
}
