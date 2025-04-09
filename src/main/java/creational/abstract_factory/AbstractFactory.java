package creational.abstract_factory;

public interface AbstractFactory {

    Car createCar(String color, double price);
    MotorCycle createMotorCycle(String type, double price);

}
