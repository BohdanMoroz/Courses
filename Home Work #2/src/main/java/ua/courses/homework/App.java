package ua.courses.homework;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.toControl();
    }
}
