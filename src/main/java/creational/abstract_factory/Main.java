package creational.abstract_factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        AbstractFactory bmwFactory = new BmwFactory();


        Car audiCar = audiFactory.createCar("White", 70000);
        Car bmwCar  = bmwFactory.createCar("Black", 60000);

        MotorCycle audiMotorCycle = audiFactory.createMotorCycle("RB-1200S", 20000);
        MotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("R1250GS", 24000);
    }

}
