package ua.courses.homework.Exceptions;

public class NotUniqueNicknameException extends RuntimeException {
    public NotUniqueNicknameException(){
        super("This nickname exist already!");
    }
}
