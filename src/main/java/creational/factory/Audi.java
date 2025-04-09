package creational.factory;

public class Audi implements Car {

    private String color;
    private double price;

    public Audi() {
    }

    public Audi(String color, double price) {
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
