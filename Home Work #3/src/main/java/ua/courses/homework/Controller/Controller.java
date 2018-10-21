package ua.courses.homework.Controller;

import ua.courses.homework.Model.Entity.Adress;
import ua.courses.homework.Model.Entity.Note;
import ua.courses.homework.Model.Model;
import ua.courses.homework.View.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    //    String REGEX_NAME_UA = "[А-ЩЬЮЯЄІЇа-щьюяєії]+-?[А-ЩЬЮЯЄІЇа-щьюяєії]+";
//    String REGEX_NAME_UA = "[\u0410-\u0429\u0404\u0406\u0407]+-?[А-ЩЬЮЯЄІЇа-щьюяєії]+";
    String REGEX_NAME = "[A-Za-z]+-?[A-Za-z]+";
    String REGEX_NICKNAME = "[A-Za-z0-9]+";
    String REGEX_COMMENT = "[A-Za-z0-9\\-\\_\\+\\=\\*\\/]+";
    String REGEX_MAIL = "^([A-Za-z0-9]+)@([A-Za-z]+)\\.([A-Za-z]{2})$";
    String REGEX_INDEX = "[0-9]{6}";
    String REGEX_BUILDING = "([0-9]{1,3})(\\/+([0-9]{0,3})?([A-Za-z]?))";
    String REGEX_PHONE_HOME = "[0-9]{10}";
    String REGEX_PHONE_MOBILE = "[0-9]{10, 12}";



    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private void inputNote(){

    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);

        Note tempNote = new Note();
        tempNote.setSurname(inputValidValue(scanner, REGEX_PHONE_MOBILE));
        System.out.println(tempNote.getSurname());
        tempNote.setName(inputValidValue(scanner, REGEX_NAME));
        tempNote.setLastName(inputValidValue(scanner, REGEX_NAME));
        tempNote.setInitials(generateInitials(tempNote.getSurname(), tempNote.getName()));

        tempNote.setNickname(inputValidValue(scanner, REGEX_NICKNAME));
        tempNote.setComment(inputValidValue(scanner, REGEX_COMMENT));
//        tempNote.setGroup();
        tempNote.setHomePhoneNumber(inputValidValue(scanner, REGEX_NAME));
        tempNote.setMobPhoneNumber(inputValidValue(scanner, REGEX_NAME));
        tempNote.setMobPhoneNumberAdditional(inputValidValue(scanner, REGEX_NAME));
        tempNote.setMail(inputValidValue(scanner, REGEX_NAME));
        tempNote.setSkype(inputValidValue(scanner, REGEX_NAME));

        Adress adress = new Adress();
        adress.setIndex(inputValidValue(scanner, REGEX_NAME));
        adress.setCity(inputValidValue(scanner, REGEX_NAME));
        adress.setStreet(inputValidValue(scanner, REGEX_NAME));
        adress.setBuildingNumber(inputValidValue(scanner, REGEX_NAME));
        adress.setFlatNumber(inputValidValue(scanner, REGEX_NAME));

        tempNote.setAdress(adress);



        model.addNote(tempNote);
        scanner.close();
    }

    private String generateInitials(String surname, String name) {
        String result = surname + " " + name.substring(0,1) + ".";
        return result;
    }

    public String inputValidValue(Scanner scanner, String regex){
        String str;

        do {
            str = scanner.next();
        } while (!validateValue(str, regex));

        return str;
    }

    private boolean validateValue(String str, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        return matcher.matches();
    }
}
