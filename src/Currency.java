
public class Currency {
    private double value;
    private Unit unit;

    public Currency(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (Double.compare(currency.value, value) != 0) return false;
        if (unit != currency.unit) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    public static Currency createCurrency(double value, Unit unit) {
        return new Currency(value * unit.getRatio(), Unit.Dollar);
    }
}
