package creational.abstract_factory;

public class CarFactory {

    public static Car createCar(String brand, String color, double price) {

        if (brand.equalsIgnoreCase("Bmw")) {
            return new BmwCar(color, price);
        } else if (brand.equalsIgnoreCase("Audi")) {
            return new AudiCar(color, price);
        } else if (brand.equalsIgnoreCase("Mazda")) {
            return new MazdaCar(color, price);
        } else if (brand.equalsIgnoreCase("Volvo")) {
            return new VolvoCar(color, price);
        } else throw new IllegalArgumentException(brand + " The production of the brand is not supported.");

    }

    public static Car createCar(Class<? extends Car> carClass) {

        if (carClass == BmwCar.class) {
            return new BmwCar();
        } else if (carClass == AudiCar.class) {
            return new AudiCar();
        } else if (carClass == MazdaCar.class) {
            return new MazdaCar();
        } else if (carClass == VolvoCar.class) {
            return new VolvoCar();
        } else throw new IllegalArgumentException("Unsupported car type: " + carClass);

    }

}
