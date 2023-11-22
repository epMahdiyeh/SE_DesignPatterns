public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 3.5;
    }
}