package ua.courses.homework;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void toControl() {
        Scanner scanner = new Scanner(System.in);
        model.generateDesiredValue();
        int desiredValue = model.getDesiredValue();

        view.printMessage(View.RULES);

        int currentValue;

        while (!model.isFinish()) {
            currentValue = inputValueWihScanner(scanner);

            if (isValidValue(currentValue)) {
                model.addToInputHistory(currentValue);
                verifyCurrentValue(desiredValue, currentValue);
            }
//            showInputHistory();
        }

        showSizeOfInputHistory();
        showInputHistory();
        scanner.close();
    }


    private void verifyCurrentValue(int desiredValue, int currentValue) {
        if (currentValue == desiredValue) {
            model.setFinish(true);
            view.printMessage(View.CONGRATULATION);
        } else if (currentValue < desiredValue) {
            model.setMinRangeValue(currentValue + 1);
            view.printMessage(View.INPUT_MORE + currentValue);
        } else if (currentValue > desiredValue) {
            model.setMaxRangeValue(currentValue - 1);
            view.printMessage(View.INPUT_LESS + currentValue);
        }

        if (model.getMinRangeValue() == model.getMaxRangeValue()) {
            model.setFinish(true);
            view.printMessage(View.LOSE);
        }
    }

    private int inputValueWihScanner(Scanner scanner) {
        view.printMessage(View.INPUT_NUMBER + View.RANGE_FROM + model.getMinRangeValue() + View.RANGE_TO + model.getMaxRangeValue() + View.RANGE_INCLUDE_NUMBER);
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_SYMBOL);
            view.printMessage(View.TRY_AGAIN);
            view.printMessage(View.INPUT_NUMBER + View.RANGE_FROM + model.getMinRangeValue() + View.RANGE_TO + model.getMaxRangeValue() + View.RANGE_INCLUDE_NUMBER);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean isValidValue(int currentValue) {
        if ((currentValue >= model.getMinRangeValue()) && (currentValue <= model.getMaxRangeValue())) {
            return true;
        } else {
            view.printMessage(View.OUT_OF_RANGE + View.RANGE_FROM + model.getMinRangeValue() + View.RANGE_TO + model.getMaxRangeValue() + View.RANGE_INCLUDE_NUMBER);
            view.printMessage(View.TRY_AGAIN);
            return false;
        }
    }

    private void showInputHistory() {
        view.printMessageWithoutCaretReturn(View.INPUT_HISTORY);
        for (Integer valueFromInputHistory : model.getInputHistory()) {
            view.printMessageWithoutCaretReturn(valueFromInputHistory + View.WHITESPACE);
        }
        view.caretReturn();
    }

    private void showSizeOfInputHistory() {
        view.printMessage(View.NUMBER_OF_ATTEMPTION + model.getInputHistory().size());
    }


}
