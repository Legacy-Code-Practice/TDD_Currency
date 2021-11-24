package MyCurrency;

public class Franc extends Money {
    public Franc(double amount) {
        super(amount);
    }

    public Franc times(double m) {
        return new Franc(this.amount * m);
    }
}
