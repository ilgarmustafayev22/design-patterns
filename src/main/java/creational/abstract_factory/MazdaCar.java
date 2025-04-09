package creational.abstract_factory;

public class MazdaCar implements Car {

    private String color;
    private double price;

    public MazdaCar() {
    }

    public MazdaCar(String color, double price) {
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
