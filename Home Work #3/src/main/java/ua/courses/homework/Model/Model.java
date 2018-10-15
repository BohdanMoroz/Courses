package ua.courses.homework.Model;

import ua.courses.homework.Model.Entity.Note;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Note> notebook = new ArrayList<>(); //can be set

    public void addNote(Note note){
        notebook.add(note);
    }
}
