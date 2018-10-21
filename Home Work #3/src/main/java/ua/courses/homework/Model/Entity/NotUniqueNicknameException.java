package ua.courses.homework.Model.Entity;

public class NotUniqueNicknameException extends RuntimeException {
    public NotUniqueNicknameException(){
        super("This nickname exist already!");
    }
}
