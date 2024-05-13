package com.example.mvvmarchitecture.repository;

import android.content.Context;

import androidx.room.Room;

import com.example.mvvmarchitecture.AppDatabase;
import com.example.mvvmarchitecture.dao.NoteDAO;
import com.example.mvvmarchitecture.models.Note;

import java.util.List;

public class NoteRepository {
    NoteDAO noteDAO;

    public NoteRepository(Context context) {
        AppDatabase appDatabase = Room.databaseBuilder(context, AppDatabase.class, "MyDB").build();
        noteDAO = appDatabase.noteDAO();
    }

    public void insertNote(Note note) {
        noteDAO.insertNote(note);
    }

    public List<Note> getNotes() {
        return noteDAO.getNotes();
    }


}
