import Rollercoaster.Ride2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ride2Test {
    Ride2 ride2;

    @Before
    public void before()  {
        ride2 = new Ride2("Catapult", 15, 12, 157);
    }

    @Test
    public void getName() {
        assertEquals("Catapult", ride2.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(15, ride2.getPrice(), 0.01);
    }

    @Test
    public void getMinAge() {
        assertEquals(12, ride2.getMinAge());
    }

    @Test
    public void getMinHeight() {
        assertEquals(5, ride2.getMinHeight(), 0.01);
    }
}
