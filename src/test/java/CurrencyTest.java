import MyCurrency.Dollar;
import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    @Test
    public void test_Currency_Multiplication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        Assert.assertEquals(10, dollar.getAmount(), 2);
    }
}