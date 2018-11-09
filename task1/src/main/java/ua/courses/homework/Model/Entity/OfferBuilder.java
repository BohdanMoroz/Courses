package ua.courses.homework.Model.Entity;

import ua.courses.homework.Model.Entity.Enum.City;
import ua.courses.homework.Model.Entity.Enum.Meal;
import ua.courses.homework.Model.Entity.Enum.Type;
import ua.courses.homework.Model.Entity.Enum.Vehicle;

public class OfferBuilder {
    private City city;
    private Type type;
    private Vehicle vehicle;
    private Meal meal;
    private int days;

    public OfferBuilder buildCity(City city){
        this.city = city;
        return this;
    }

    public OfferBuilder buildType(Type type){
        this.type = type;
        return this;
    }

    public OfferBuilder buildVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return this;
    }

    public OfferBuilder buildMeal(Meal meal){
        this.meal = meal;
        return this;
    }

    public OfferBuilder buildDays(int days){
        this.days = days;
        return this;
    }

    public Offer build(){
        Offer offer = new Offer();

        offer.setCity(city);
        offer.setType(type);
        offer.setVehicle(vehicle);
        offer.setMeal(meal);
        offer.setDays(days);

        return offer;
    }
}
