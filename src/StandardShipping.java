package src;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 2.5;
    }
}