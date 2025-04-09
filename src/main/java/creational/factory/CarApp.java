package creational.factory;

public class CarApp {

    public static void main(String[] args) {
        Car bmw = CarFactory.createCar("bmw", "black", 100_000);
        System.out.println(bmw);

        Car mazda = CarFactory.createCar("MazDa", "white", 45000);
        System.out.println(mazda);

        Car volvo = CarFactory.createCar("VOLVO", "red", 80000);
        System.out.println(volvo);

        Car audi = CarFactory.createCar("Audi", "gray", 90000);
        System.out.println(audi);

        Car bmw2 = CarFactory.createCar(Bmw.class);
        System.out.println(bmw2);
    }

}
