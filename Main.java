import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double packageWeight = scanner.nextDouble();

        ShippingStrategy defaultShipping = new StandardShipping();
        ShippingContext shippingContext = new ShippingContext(defaultShipping);

        System.out.print("Is the package delivered? true or false? : ");
        boolean isDelivered = scanner.nextBoolean();

        System.out.print("Enter transit duration: ");
        int transitDuration = scanner.nextInt();

        PackageContext packageContext = new PackageContext(packageWeight, isDelivered, transitDuration);

        while (!packageContext.isDelivered()) {
            System.out.print("Choose shipping method: 1. Standard, 2. Express: ");
            int shippingMethod = scanner.nextInt();
            if (shippingMethod == 1) {
                shippingContext.setShippingStrategy(new StandardShipping());
            } else if (shippingMethod == 2) {
                shippingContext.setShippingStrategy(new ExpressShipping());
            } else {
                System.out.println("Invalid input");
                continue;
            }
            double shippingPrice = shippingContext.calculateShippingPrice(packageWeight);
            System.out.println("Shipping price is : " + shippingPrice + "Tooman");

            packageContext.updateState();
            packageContext.printStatus();
        }

        System.out.println("Package has been delivered");
    }
}
