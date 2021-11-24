package MyCurrency;

public class Dollar extends Money {

    public Dollar(double amount) {
        super(amount);
    }

    public Dollar times(double m) {
        return new Dollar(this.amount * m);
    }
}
