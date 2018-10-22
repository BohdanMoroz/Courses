package ua.courses.homework.Model;

import ua.courses.homework.Exceptions.NotUniqueNicknameException;
import ua.courses.homework.Model.Entity.Note;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Note> notebook = new ArrayList<>();

    public Model() {

    }

    public void addNote(Note note){
        checkNickname(note);
        System.out.println("Done");
        notebook.add(note);
    }

    private void checkNickname(Note note) {
        if (notebook.indexOf(note) == -1) {
            throw new NotUniqueNicknameException();
        }
    }
}
