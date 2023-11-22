package src;

public class IntransitState implements PackageState {
    private int transitDuration;

    public IntransitState(int transitDuration) {
        this.transitDuration = transitDuration;
    }

    @Override
    public void printStatus() {
        System.out.println("Package is in transit state");
    }

    @Override
    public boolean updateState(PackageContext packageContext) {
        transitDuration--;
        if (transitDuration == 0) {
            packageContext.setPackageState(new DeliveredState());
            return true;
        }
        return false;
    }
}
