package com.example.mvvmarchitecture.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Note")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "note_name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Note(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
