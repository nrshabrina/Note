package com.nurshabrina.noteme;

import com.dicoding.picodiploma.mynotesapp.entity.Note;
import java.util.ArrayList;


public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

