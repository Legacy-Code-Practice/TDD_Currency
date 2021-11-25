package MyCurrency;

public abstract class Money {
    protected final double amount;

    public Money(double amount) {
        this.amount = amount;
    }


    public boolean equals(Object o) {
        Money d = (Money) o;
        return this.amount == d.amount
                && getClass().equals(d.getClass());
    }

    public static Dollar dollar(double m) {
        return new Dollar(m);
    }

    public static Franc franc(double m) {
        return new Franc(m);
    }

    public abstract Money times(double m);
}
