package src;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShippingTest {
    @Test
    public void testStandard() {
        ShippingStrategy standardShipping = new StandardShipping();
        double price = standardShipping.calculatePrice(2.0);
        assertEquals(5.0, price, 0.001);
    }

    @Test
    public void testExpress() {
        ShippingStrategy expressShipping = new ExpressShipping();
        double price = expressShipping.calculatePrice(2.0);
        assertEquals(7.0, price, 0.001);
    }
}
