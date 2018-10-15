package ua.courses.homework;

public class View {
    public static final String RULES = "\nГра \'Більше-менше\'.\n" +
            "Правила гри: програма загадує число від 0 до 100 включно.\n" +
            "Для того, щоб виграти Вам потрбіно відгадати це число.\n" +
            "Якщо введене число не відповідає загаданому, але входить в діапазон, " +
            "то з кожною такою спробою границі діапазона будуть звужуватися.\n" +
            "Якщо загадане число більше введеного користувачем, то по нижній " +
            "границі, а якщо менше - по верхній.\n";
    public static final String INPUT_NUMBER = "Будь ласка введіть чилсло, яке входить в ";
    public static final String RANGE_FROM = "діапазон від ";
    public static final String RANGE_TO = " до ";
    public static final String RANGE_INCLUDE_NUMBER = " включно.";
    public static final String OUT_OF_RANGE = "Введене число не входить в ";
    public static final String WRONG_INPUT_SYMBOL = "Введено недопустиме значення!";
    public static final String TRY_AGAIN = "Спробуйте ще раз!";
    public static final String INPUT_MORE = "Загадане число більше, ніж ";
    public static final String INPUT_LESS = "Загадане число менше, ніж ";

    public static final String CONGRATULATION = "Вітаємо, Ви виграли!";
    public static final String NUMBER_OF_ATTEMPTION = "Кількість введених чисел: ";
    public static final String INPUT_HISTORY = "Було введено такі числа: ";
    public static final String LOSE = "Ви програли!";
    public static final String WHITESPACE = " ";

    public void caretReturn() {
        System.out.println("\n");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithoutCaretReturn(String message){
        System.out.print(message);
    }

//    public void printMessageAndNumber(String message, int number){
//        System.out.println(message + number);
//    }
//
//    public void printMessageAndNumberWithoutCaretReturn(String message, int number){
//        System.out.print(message + number);
//    }

}
