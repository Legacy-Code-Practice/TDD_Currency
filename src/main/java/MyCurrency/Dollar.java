package MyCurrency;

public class Dollar {
    private double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void times(double m) {
        this.amount = this.amount * m;
    }

    public boolean equals(Object o) {
        Dollar d = (Dollar) o;
        return this.amount == d.amount;
    }
}
