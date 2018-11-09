package ua.courses.homework.Controller;

import ua.courses.homework.Model.Entity.Groups;
import ua.courses.homework.Model.Entity.Note;
import ua.courses.homework.Model.Model;
import ua.courses.homework.View.TextConstant;
import ua.courses.homework.View.View;

import java.util.Scanner;

import static ua.courses.homework.Controller.RegexContainer.*;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.printMessage(TextConstant.GREETING);
        Scanner scanner = new Scanner(System.in);

        Note tempNote = fillTheNote(new Note(), scanner);
        addNote(scanner, tempNote);
        view.printMessage(TextConstant.INFO + tempNote.getNickname());
        scanner.close();
    }

    private Note fillTheNote(Note tempNote, Scanner scanner) {
        tempNote.setNickname(inputValidValue(scanner, REGEX_NICKNAME));
        return tempNote;
    }

    private void addNote(Scanner scanner, Note tempNote) {
        try {
            model.addNote(tempNote);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            tempNote.setNickname(inputValidValue(scanner, REGEX_NICKNAME));
            addNote(scanner, tempNote);
        }
    }


    private String generateInitials(String surname, String name) {
        String result = surname + " " + name.substring(0, 1) + ".";
        return result;
    }

    private String generateFullAdress(String index, String city, String street, String buildingNumber, String flatNumber) {
        String result = index + " " + city + " " + street + " " + buildingNumber + " " + flatNumber;
        return result;
    }

    public String inputValidValue(Scanner scanner, String regex) {
        view.printMessage(TextConstant.INPUT_NICKNAME);
        String res;

        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printMessage(TextConstant.WRONG_SYMBOL);
        }

        return res;
    }

}
