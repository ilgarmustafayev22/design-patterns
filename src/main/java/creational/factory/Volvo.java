package creational.factory;

public class Volvo implements Car{

    private String color;
    private double price;

    public Volvo() {
    }

    public Volvo(String color, double price) {
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
        return "Volvo{color='%s', price=%s}".formatted(color, price);
    }

}
