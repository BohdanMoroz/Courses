package ua.courses.homework;

import ua.courses.homework.Controller.Controller;
import ua.courses.homework.Model.Model;
import ua.courses.homework.View.View;

public class App
{
    public static void main( String[] args )
    {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.execute();

    }
}
