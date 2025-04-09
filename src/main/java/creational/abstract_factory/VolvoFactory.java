package creational.abstract_factory;

public class VolvoFactory implements AbstractFactory {

    @Override
    public Car createCar(String color, double price) {
        return new VolvoCar(color, price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new VolvoMotorCycle(type, price);
    }

}
