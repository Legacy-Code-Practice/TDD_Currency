import MyCurrency.Dollar;
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
        Dollar dollar1 = new Dollar(5);
        Dollar dollar2 = new Dollar(5);
        Assert.assertTrue(dollar1.equals(dollar2));

        Dollar dollar3 = new Dollar(6);
        Assert.assertFalse(dollar1.equals(dollar3));
    }
}