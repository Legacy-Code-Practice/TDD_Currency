package MyCurrency;

public class Money {
    protected final double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public boolean equals(Object o) {
        Money d = (Money) o;
        return this.amount == d.amount
                && getClass().equals(d.getClass());
    }
}
