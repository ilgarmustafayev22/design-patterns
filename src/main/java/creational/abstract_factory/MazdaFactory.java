package creational.abstract_factory;

public class MazdaFactory implements AbstractFactory {

    @Override
    public Car createCar(String color, double price) {
        return new MazdaCar(color, price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorCycle(type, price);
    }

}
