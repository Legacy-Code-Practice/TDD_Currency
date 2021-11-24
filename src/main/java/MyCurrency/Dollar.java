package MyCurrency;

public class Dollar {
    private final double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    public Dollar times(double m) {
        return new Dollar(this.amount * m);
    }

    public boolean equals(Object o) {
        Dollar d = (Dollar) o;
        return this.amount == d.amount;
    }
}
