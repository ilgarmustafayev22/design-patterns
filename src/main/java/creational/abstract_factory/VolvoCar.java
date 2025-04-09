package creational.abstract_factory;

public class VolvoCar implements Car {

    private String color;
    private double price;

    public VolvoCar() {
    }

    public VolvoCar(String color, double price) {
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
