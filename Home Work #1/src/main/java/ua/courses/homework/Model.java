package ua.courses.homework;

public class Model {
    public static final String EMPTY = "";
    public static final String WHITESPACE = " ";

    private String sentence = EMPTY;
    private int wordNumber = 0;

    public String getSentence() {
        return sentence;
    }

    public void addWordToSentence(String word) {
        if (++wordNumber > 1) {
            sentence += WHITESPACE;
        }
        sentence += word;
    }
}
