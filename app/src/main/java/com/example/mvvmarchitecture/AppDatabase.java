package com.example.mvvmarchitecture;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mvvmarchitecture.dao.NoteDAO;
import com.example.mvvmarchitecture.models.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDAO noteDAO();

}
