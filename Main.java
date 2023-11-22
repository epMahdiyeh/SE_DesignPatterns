public class Main {
    public static void main(String[] args) {
        double packageWeight = 1.4;

        ShippingStrategy standardShipping = new StandardShipping();
        ShippingStrategy expressShipping = new ExpressShipping();

        PackageContext packageContext = new PackageContext();

        ShippingContext shippingContext = new ShippingContext(standardShipping);
        double standardShippingPrice = shippingContext.calculateShippingPrice(packageWeight);
        System.out.println("Standard Shipping Price is : " + standardShippingPrice + " Tooman");

        shippingContext.setShippingStrategy(expressShipping);
        double expressShippingPrice = shippingContext.calculateShippingPrice(packageWeight);
        System.out.println("Express Shipping Price is : " + expressShippingPrice + " Tooman");

        packageContext.updateState();
        packageContext.printStatus();

        packageContext.setPackageState(new DeliveredState());
        packageContext.updateState();
        packageContext.printStatus();
    }
}
