import Rollercoaster.Ride1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ride1Test {
    Ride1 ride1;

    @Before
    public void before()  {
        ride1 = new Ride1("Boomerang", 10, 8, 127.2);
    }

    @Test
    public void getName() {
        assertEquals("Boomerang", ride1.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(10, ride1.getPrice(), 0.01);
    }

    @Test
    public void getAge() {
        assertEquals(8, ride1.getMinAge());
    }

    @Test
    public void getMinHeight() {
        assertEquals(4, ride1.getMinHeight(), 0.01);
    }
}
