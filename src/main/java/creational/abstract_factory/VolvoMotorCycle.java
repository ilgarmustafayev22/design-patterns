package creational.abstract_factory;

public class VolvoMotorCycle implements MotorCycle{

    private String type;
    private double price;

    public VolvoMotorCycle(String type, double price) {
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
