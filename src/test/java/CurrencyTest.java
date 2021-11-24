import MyCurrency.Dollar;
import MyCurrency.Franc;
import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    @Test
    public void test_Currency_Multiplication() {
        Dollar dollar = new Dollar(5);
        Assert.assertEquals(new Dollar(10), dollar.times(2));
        Assert.assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertEquals(new Dollar(5), new Dollar(5));
        Assert.assertNotEquals(new Dollar(5), new Dollar(6));
        Assert.assertEquals(new Franc(5), new Franc(5));
        Assert.assertNotEquals(new Franc(5), new Franc(6));
    }

    @Test
    public void test_FranceMultiplication() {
        Franc dollar = new Franc(5);
        Assert.assertEquals(new Franc(10), dollar.times(2));
        Assert.assertEquals(new Franc(15), dollar.times(3));
    }
}