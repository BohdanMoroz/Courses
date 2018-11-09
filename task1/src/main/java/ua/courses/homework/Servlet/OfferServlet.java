package ua.courses.homework.Servlet;


import ua.courses.homework.Model.Entity.Enum.City;
import ua.courses.homework.Model.Entity.Enum.Meal;
import ua.courses.homework.Model.Entity.Enum.Vehicle;
import ua.courses.homework.Model.Entity.Offer;
import ua.courses.homework.Model.Entity.Enum.Type;
import ua.courses.homework.Model.Entity.OfferBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class OfferServlet  extends HttpServlet {
    private List<Offer> offerList;
    OfferBuilder offerBuilder;



    @Override
    public void init() {
        offerList = new CopyOnWriteArrayList<>();
        offerBuilder = new OfferBuilder();

        offerList.add(offerBuilder.buildType(Type.CRUISE)
                .buildCity(City.KRAKOW)
                .buildVehicle(Vehicle.BUS)
                .buildMeal(Meal.ALL_INCLUSIVE)
                .buildDays(5)
                .build()
        );

        offerList.add(offerBuilder.buildType(Type.SHOPPING)
                .buildCity(City.MARRAKECH)
                .buildVehicle(Vehicle.PlANE)
                .buildMeal(Meal.BED_AND_BREAKFAST)
                .buildDays(8)
                .build()
        );

        offerList.add(offerBuilder.buildType(Type.RELAXATION)
                .buildCity(City.LAGOS)
                .buildVehicle(Vehicle.BUS)
                .buildMeal(Meal.ALL_INCLUSIVE)
                .buildDays(3)
                .build()
        );
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("offerList", offerList);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
