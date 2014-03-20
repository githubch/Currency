import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CurrencyTest {

    private Currency euro10;

    @Before
    public void setUp() throws Exception {
        euro10 = Currency.createCurrency(10, Unit.Euro);
    }

    @Test
    public void assert10EuroEquals10Euro() {
        assertEquals(euro10, Currency.createCurrency(10, Unit.Euro));
    }

    @Test
    public void assert10EuroNotEquals5Euro() {
        assertFalse(euro10.equals(Currency.createCurrency(5, Unit.Euro)));
    }

    @Test
    public void assert10EuroNotEqualsNull() {
        assertFalse(euro10.equals(null));
    }

    @Test
    public void assert10EuroEqualsThirteenPointFiveDollars() throws Exception {
        assertTrue(euro10.equals(Currency.createCurrency(13.5, Unit.Dollar)));
    }

    @Test
    public void assertThirteenPointFiveDollarsEquals10Euro() throws Exception {
        assertTrue(Currency.createCurrency(13.5, Unit.Dollar).equals(euro10));
    }

    @Test
    public void assert10EuroNotEquals14Dollars() throws Exception {
        assertFalse(euro10.equals(Currency.createCurrency(14, Unit.Dollar)));
    }
}
