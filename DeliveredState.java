class DeliveredState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package is delivered successfully");
    }
    @Override
    public boolean updateState(PackageContext packageContext) {
        return false;
    }
}