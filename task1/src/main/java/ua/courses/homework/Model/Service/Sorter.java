package ua.courses.homework.Model.Service;

import ua.courses.homework.Model.Entity.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    public List<Offer> sort(List<Offer> offerList, Comparator<Offer> comparator){
        return offerList.stream()
                        .sorted(comparator)
                        .collect(Collectors.toList());
    }
}
