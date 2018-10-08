package ua.courses.homework;

import java.util.Scanner;

public class Controller {
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void toControl(){
        Scanner scanner = new Scanner(System.in);

        model.addWordToSentence(inputWordWithScanner(scanner, HELLO));
        model.addWordToSentence(inputWordWithScanner(scanner, WORLD));

        view.printMessage(model.getSentence());
        scanner.close();
    }

    public String inputWordWithScanner (Scanner scanner, String requiredWord){
        view.printMessage(View.INPUT_WORD + requiredWord);

        while (! scanner.hasNext(requiredWord)) {
            view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_WORD);
            scanner.next();
        }

        return scanner.next();
    }
}
