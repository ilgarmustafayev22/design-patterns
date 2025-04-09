package creational.abstract_factory;

public class AudiCar implements Car {

    private String color;
    private double price;

    public AudiCar() {
    }

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Audi{color='%s', price=%s}".formatted(color, price);
    }

}
