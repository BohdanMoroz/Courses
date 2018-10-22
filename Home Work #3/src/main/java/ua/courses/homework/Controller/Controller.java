package ua.courses.homework.Controller;

import ua.courses.homework.Model.Entity.Groups;
import ua.courses.homework.Model.Entity.Note;
import ua.courses.homework.Model.Model;
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
        Scanner scanner = new Scanner(System.in);

        Note tempNote = fillTheNote(new Note(), scanner);
        addNote(scanner, tempNote);
        scanner.close();
    }

    private Note fillTheNote(Note tempNote, Scanner scanner) {
//        tempNote.setSurname(inputValidValue(scanner, REGEX_PHONE_MOBILE));
//        tempNote.setName(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setLastName(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setInitials(generateInitials(tempNote.getSurname(), tempNote.getName()));
        tempNote.setNickname(inputValidValue(scanner, REGEX_NICKNAME));
//        tempNote.setComment(inputValidValue(scanner, REGEX_COMMENT));
//        tempNote.setGroup(Groups.COWORKERS.toString());
//        tempNote.setHomePhoneNumber(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setMobPhoneNumber(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setMobPhoneNumberAdditional(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setMail(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setSkype(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setIndex(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setCity(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setStreet(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setBuildingNumber(inputValidValue(scanner, REGEX_NAME));
//        tempNote.setFlatNumber(inputValidValue(scanner, REGEX_NAME));
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
        String res;

        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
//            view.printWrongStringInput(message);
        }

        return res;
    }

}
