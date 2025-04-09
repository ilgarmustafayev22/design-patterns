package creational.factory;

public class CarFactory {

    public static Car createCar(String brand, String color, double price) {

        if (brand.equalsIgnoreCase("Bmw")) {
            return new Bmw(color, price);
        } else if (brand.equalsIgnoreCase("Audi")) {
            return new Audi(color, price);
        } else if (brand.equalsIgnoreCase("Mazda")) {
            return new Mazda(color, price);
        } else if (brand.equalsIgnoreCase("Volvo")) {
            return new Volvo(color, price);
        } else throw new IllegalArgumentException(brand + " The production of the brand is not supported.");

    }

    public static Car createCar(Class<? extends Car> carClass) {

        if (carClass == Bmw.class) {
            return new Bmw();
        } else if (carClass == Audi.class) {
            return new Audi();
        } else if (carClass == Mazda.class) {
            return new Mazda();
        } else if (carClass == Volvo.class) {
            return new Volvo();
        } else throw new IllegalArgumentException("Unsupported car type: " + carClass);

    }

}
