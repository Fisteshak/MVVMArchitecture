package com.example.mvvmarchitecture.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mvvmarchitecture.models.Note;

import java.util.List;

@Dao
public interface NoteDAO {
    @Query("SELECT * FROM Note")
    public List<Note> getNotes();

    @Insert(onConflict=OnConflictStrategy.REPLACE)
    public void insertNote(Note note);

    @Query("DELETE FROM Note WHERE id=:id")
    public void deleteById(int id);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    public void updateNote(Note note);

}
