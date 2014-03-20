public enum Unit {
    Euro(1.35), Dollar(1);
    private double ratio;

    Unit(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
