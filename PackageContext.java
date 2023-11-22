class PackageContext {
    private PackageState packageState;

    public PackageContext() {
        this.packageState = new IntransitState();
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public void printStatus() {
        packageState.printStatus();
    }

    public void updateState() {
        packageState.updateState(this);
    }
}