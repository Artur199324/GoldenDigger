package com.goldn.diggr;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "playerCD")
public class PlaCD {

    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "logCD")
    String logCD;
    @ColumnInfo(name = "passCD")
    String passCD;

    public PlaCD(String logCD, String passCD) {
        this.logCD = logCD;
        this.passCD = passCD;
    }

    public PlaCD() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogCD() {
        return logCD;
    }

    public void setLogCD(String logCD) {
        this.logCD = logCD;
    }

    public String getPassCD() {
        return passCD;
    }

    public void setPassCD(String passCD) {
        this.passCD = passCD;
    }
}
