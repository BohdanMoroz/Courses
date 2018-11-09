package ua.courses.homework;

public class Radio implements ElectricityConsumer {

    public void playMusic(){
        System.out.println("Radio is playing");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
