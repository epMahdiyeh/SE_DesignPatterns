class IntransitState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package in transit state");
    }
    @Override
    public void updateState(PackageContext packageContext) {
    }
}