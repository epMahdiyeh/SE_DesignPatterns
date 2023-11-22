class IntransitState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package currently is in transit state");
    }
    @Override
    public void updateState(PackageContext packageContext) {
    }
}