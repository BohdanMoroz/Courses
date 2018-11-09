package ua.courses.homework;

public class Program {

    public static void fire(Object sender){
        System.out.println("Fire from lambda! (Method)");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);


//        class Fire implements ElectricityConsumer {
//            public void electricityOn() {
//                System.out.println("Fire!");
//            }
//        }

        sw.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object sender) {
                        System.out.println("Fire from anonymous class!");
                    }
                }
        );

//        sw.addElectricityListener( sender -> System.out.println("Fire from lambda!") );
//        sw.addElectricityListener( sender -> Program.fire(sender) );
        sw.addElectricityListener( Program::fire );

        sw.switchOn();
    }
}
