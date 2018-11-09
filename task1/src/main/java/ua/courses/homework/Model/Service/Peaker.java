package ua.courses.homework.Model.Service;

import ua.courses.homework.Model.Entity.Enum.Vehicle;
import ua.courses.homework.Model.Entity.Offer;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Peaker {

    public List<Offer> peak(List<Offer> offerList, Predicate<Offer> predicate){
        return offerList.stream()
                        .filter(predicate)
                        .collect(Collectors.toList());
    }
}
