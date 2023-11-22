public class PackageContext {
    private PackageState packageState;
    private boolean isDelivered;

    public PackageContext(double packageWeight, boolean isDelivered, int transitDuration) {
        this.isDelivered = isDelivered;
        this.packageState = new IntransitState(transitDuration);
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public void printStatus() {
        packageState.printStatus();
    }

    public void deliverPackage() {
        System.out.println("Package has been delivered.");
    }


    public void updateState() {
        boolean isDelivered = packageState.updateState(this);
        if (isDelivered) {
            deliverPackage();
        }
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
