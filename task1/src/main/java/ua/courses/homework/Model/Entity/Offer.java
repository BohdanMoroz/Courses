package ua.courses.homework.Model.Entity;

import ua.courses.homework.Model.Entity.Enum.*;

public class Offer {
    private City city;
    private Type type;
    private Vehicle vehicle;
    private Meal meal;
    private int days;

    public void setCity(City city) {
        this.city = city;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public City getCity() {
        return city;
    }

    public Type getType() {
        return type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Meal getMeal() {
        return meal;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "city=" + city +
                ", type=" + type +
                ", vehicle=" + vehicle +
                ", meal=" + meal +
                ", days=" + days +
                '}';
    }
}
