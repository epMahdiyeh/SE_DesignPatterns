package src;

interface PackageState {
    void printStatus();
    boolean updateState(PackageContext packageContext);
}