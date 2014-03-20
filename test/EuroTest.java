import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class EuroTest {
    @Test
    public void assert10EuroEquals10Euro() {
        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void assert10EuroNotEquals5Euro() {
        assertFalse(new Euro(10).equals(new Euro(5)));
    }

    @Test
    public void assert10EuroNotEqualsNull() {
        assertFalse(new Euro(10).equals(null));
    }
}
