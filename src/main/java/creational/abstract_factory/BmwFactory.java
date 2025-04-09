package creational.abstract_factory;

public class BmwFactory implements AbstractFactory{

    @Override
    public Car createCar(String color, double price) {
        return new BmwCar(color, price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorCycle(type, price);
    }

}
