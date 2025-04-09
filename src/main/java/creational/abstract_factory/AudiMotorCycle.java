package creational.abstract_factory;

public class AudiMotorCycle implements MotorCycle{
    private String type;
    private double price;

    public AudiMotorCycle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
