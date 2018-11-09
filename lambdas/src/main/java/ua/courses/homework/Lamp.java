package ua.courses.homework;

public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Light is On!");
    }

    @Override
    public void electricityOn(Object sender){
        lightOn();
    }
}
