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
        int desiredValue = model.getDesiredValue();

        view.printMessage(View.RULES);

        int currentValue;

        while (!model.isWin()){
            currentValue = inputNumberWihScanner(scanner);

            if (validateInput(currentValue)) {
                model.addAttemptToInputHistory(currentValue);
                verifyCurrentValue(desiredValue, currentValue); //Change the name!
            }
        }




        scanner.close();
    }

    private void verifyCurrentValue(int desiredValue, int currentValue) {
        if ( currentValue == desiredValue) {
            model.setWin(true);
            view.printMessage(View.CONGRATULATION);
        } else if (currentValue < desiredValue) {
            model.setMinRangeValue(currentValue);
            view.printMessage(View.INPUT_MORE);
        } else if (currentValue > desiredValue) {
            model.setMaxRangeValue(currentValue);
            view.printMessage(View.INPUT_LESS);
        }
    }

    private int inputNumberWihScanner(Scanner scanner){
        view.printMessage(View.INPUT_NUMBER + View.RANGE_FROM + model.getMinRangeValue() + View.RANGE_TO + model.getMaxRangeValue() + View.RANGE_INCLUDE_NUMBER);
        while (!scanner.hasNextInt()){
            view.printMessage(View.WRONG_INPUT_SYMBOL);
            view.printMessage(View.TRY_AGAIN);
            scanner.nextInt();
        }
        return scanner.nextInt();
    }

    private boolean validateInput(int currentValue) {
        if ( (currentValue >= model.getMinRangeValue()) && (currentValue <= model.getMaxRangeValue()) ) {
            return true;
        } else {
            view.printMessage(View.OUT_OF_RANGE);
            view.printMessage(View.TRY_AGAIN);
            return false;
        }
    }
}
