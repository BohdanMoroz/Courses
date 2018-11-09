package ua.courses.homework;

import ua.courses.homework.Model.Entity.Enum.City;
import ua.courses.homework.Model.Entity.Enum.Meal;
import ua.courses.homework.Model.Entity.Enum.Type;
import ua.courses.homework.Model.Entity.Enum.Vehicle;
import ua.courses.homework.Model.Entity.Offer;
import ua.courses.homework.Model.Entity.OfferBuilder;
import ua.courses.homework.Model.Service.Peaker;
import ua.courses.homework.Model.Service.Sorter;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Offer> offerList;

        offerList = new CopyOnWriteArrayList<>();
        OfferBuilder offerBuilder = new OfferBuilder();

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

        System.out.println("Before sorting");
        for (Offer offer : offerList){
            System.out.println(offer.toString());
        }

        System.out.println();
        System.out.println("After sorting");


        List<Offer> offerList2;
//        offerList2 = offerList.stream()
//                .sorted(Comparator.comparing(Offer::getDays).reversed())
//                .collect(Collectors.toList());
////                .forEach(Offer::toString);
        Sorter sorter = new Sorter();
        Comparator<Offer> comparator = Comparator.comparing(Offer::getDays);
        offerList2 = sorter.sort(offerList, comparator);
//        sorter.show(new Offer().getCity());


        for (Offer offer : offerList2){
            System.out.println(offer.toString());
        }

        List<Offer> offerList3;
        System.out.println("After peak");
        Peaker peaker = new Peaker();
        Predicate<Offer> predicate = x -> x.getVehicle() == Vehicle.BUS;
        offerList3 = peaker.peak(offerList2, predicate);
//        offerList3 = offerList2.stream()
//                                .filter(x -> x.getVehicle() == Vehicle.BUS)
//                                .collect(Collectors.toList());

        for (Offer offer : offerList3){
            System.out.println(offer.toString());
        }




    }
}
