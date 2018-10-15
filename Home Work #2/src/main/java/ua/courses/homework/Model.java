package ua.courses.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class    Model {
    private static final int DEFAULT_MAX_RANGE_VALUE = 99;
    private static final int DEFAULT_MIN_RANGE_VALUE = 1;
    private static final int INCLUDE_LAST_NUMBER = 1;

    private int maxRangeValue = DEFAULT_MAX_RANGE_VALUE;
    private int minRangeValue = DEFAULT_MIN_RANGE_VALUE;

    private boolean isWin;

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }

    private List<Integer> inputHistory = new ArrayList<>();
    private int desiredValue;


    public void generateDesiredValue() {
        Random random = new Random();
        desiredValue = random.nextInt(DEFAULT_MAX_RANGE_VALUE + INCLUDE_LAST_NUMBER) + DEFAULT_MIN_RANGE_VALUE;
    }

    public int getDesiredValue() {
        return desiredValue;
    }

    public void addAttemptToInputHistory(int inputValue){
        inputHistory.add(inputValue);
    }

    public int getMaxRangeValue() {
        return maxRangeValue;
    }

    public int getMinRangeValue() {
        return minRangeValue;
    }

    public List<Integer> getInputHistory() {
        return inputHistory;
    }

    public void setMaxRangeValue(int maxRangeValue) {
        this.maxRangeValue = maxRangeValue;
    }

    public void setMinRangeValue(int minRangeValue) {
        this.minRangeValue = minRangeValue;
    }
}
