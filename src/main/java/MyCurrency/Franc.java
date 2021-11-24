package MyCurrency;

public class Franc {
    private final double amount;

    public Franc(double amount) {
        this.amount = amount;
    }

    public Franc times(double m) {
        return new Franc(this.amount * m);
    }

    public boolean equals(Object o) {
        Franc d = (Franc) o;
        return this.amount == d.amount;
    }
}
