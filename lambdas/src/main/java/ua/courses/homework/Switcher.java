package ua.courses.homework;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<ElectricityConsumer>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Switcher is On!");

//        if (listeners != null) {
//            listeners.electricityOn();
//        }

        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
