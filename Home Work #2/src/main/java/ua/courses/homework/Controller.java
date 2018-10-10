package ua.courses.homework;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void toControl(){
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.RULES);

        int desiredValue = model.getDesiredValue();

        while (!model.isWin()){
            model.addAttemptToInputHistory(inputNumberWihScanner(scanner, desiredValue));
        }

    }

    private int inputNumberWihScanner(Scanner scanner, int desiredValue){
        return 1;
    }
}
