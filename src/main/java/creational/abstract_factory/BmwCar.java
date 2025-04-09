package creational.abstract_factory;

public class BmwCar implements Car {

    private String color;
    private double price;

    public BmwCar() {
    }

    public BmwCar(String color, double price) {
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
        return "Bmw{color='%s', price=%s}".formatted(color, price);
    }

}
