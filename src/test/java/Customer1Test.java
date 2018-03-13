import Customer.Customer1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Customer1Test {

    Customer1 customer1;

    @Before
    public void before() {
        customer1 = new Customer1("Sally", 12, 160, 20);
    }

    @Test
    public void getName() {
        assertEquals("Sally", customer1.getName());
    }

    @Test
    public void getAge() {
        assertEquals(12, customer1.getAge());

    }

    @Test
    public void getHeight() {
        assertEquals(160, customer1.getHeight());
    }

    @Test
    public void getWallet() {
        assertEquals(20, customer1.getWallet(), 0.01);
    }

}
