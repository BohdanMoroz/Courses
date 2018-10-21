package ua.courses.homework.Model;

import ua.courses.homework.Model.Entity.NotUniqueNicknameException;
import ua.courses.homework.Model.Entity.Note;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
    List<Note> notebook = new ArrayList<>();

    public Model() {

    }

    public void addNote(Note note){
        checkNickname(note);
        notebook.add(note);
    }

    private void checkNickname(Note note) {
        if (notebook.indexOf(note) == -1) {
            throw new NotUniqueNicknameException();
        }
    }
}
