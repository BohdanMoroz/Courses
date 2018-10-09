package ua.courses.homework;

public class Model {
    public static final String EMPTY = "";

    private String sentence = EMPTY;
    private int wordNumber = 0;

    public int getWordNumber() {
        return wordNumber;
    }

    public String getSentence() {
        return sentence;
    }

    public void addWordToSentence(String word) {
        sentence += word;
    }

    public void incrementWordNumber() {
        wordNumber++;
    }
}
