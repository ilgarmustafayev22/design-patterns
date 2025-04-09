package creational.factory;

public class Mazda implements Car {

    private String color;
    private double price;

    public Mazda() {
    }

    public Mazda(String color, double price) {
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
        return "Mazda{color='%s', price=%s}".formatted(color, price);
    }

}
