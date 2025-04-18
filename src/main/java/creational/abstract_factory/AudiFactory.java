package creational.abstract_factory;

public class AudiFactory implements AbstractFactory{

    @Override
    public Car createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorCycle(type, price);
    }

}
