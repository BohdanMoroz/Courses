package ua.courses.homework;

public class Model {
    public static final String EMPTY = "";

    private String sentence = EMPTY;

    public String getSentence() {
        return sentence.trim();
    }

    public void addWordToSentence(String word) {
        sentence += word;
    }

}
