import Rollercoaster.Rides;
import Customer.Customer1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    Rides rides;
    Customer1 customer1;
    ThemePark themepark;

    @Before
    public void before(){
        ThemePark = new ThemePark(rides, customer1);
    }

    @Test
    public void customerHasSufficientFunds() {
        assertEquals(true, customer1.GetWallet(20));
    }
}
