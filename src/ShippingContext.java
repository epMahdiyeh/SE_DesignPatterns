package src;

class ShippingContext {
    private ShippingStrategy shippingStrategy;
    public ShippingContext(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
    public double calculateShippingPrice(double weight) {
        return shippingStrategy.calculatePrice(weight);
    }
}