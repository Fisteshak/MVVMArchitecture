package com.example.mvvmarchitecture.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmarchitecture.models.Note;
import com.example.mvvmarchitecture.repository.NoteRepository;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> notesLD = new MutableLiveData<>();
    private NoteRepository noteRepository;

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public MutableLiveData<String> getNotesLD() {
        return notesLD;
    }

    public void setNotesLD(String noteStr) {
        this.notesLD.postValue(noteStr);
    }

    public void init(Context context) {
        noteRepository = new NoteRepository(context);
    }

    public void insertClick() {
        executorService.execute(() -> {
            noteRepository.insertNote(new Note("matvey"));
        });
    }

    public void getAllClick() {
        executorService.execute(() -> {
            notesLD.postValue((noteRepository.getNotes().toString()));
        });
    }
}
