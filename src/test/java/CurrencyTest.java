import MyCurrency.Money;
import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    @Test
    public void test_Currency_Multiplication() {
        Money dollar = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), dollar.times(2));
        Assert.assertEquals(Money.dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertEquals(Money.dollar(5), Money.dollar(5));
        Assert.assertNotEquals(Money.dollar(5), Money.dollar(6));
        Assert.assertEquals(Money.franc(5), Money.franc(5));
        Assert.assertNotEquals(Money.franc(5), Money.franc(6));
        Assert.assertNotEquals(Money.franc(5), Money.dollar(6));
        Assert.assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    public void test_FranceMultiplication() {
        Money franc = Money.franc(5);
        Assert.assertEquals(Money.franc(10), franc.times(2));
        Assert.assertEquals(Money.franc(15), franc.times(3));
    }
}