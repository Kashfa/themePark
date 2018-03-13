import Customer.Customer1;
import Rollercoaster.Rides;

public class ThemePark {

    private Rides rides;
    private Customer1 customer1;

    ThemePark(Rides rides, Customer1 customer1) {
        this.rides = rides;
        this.customer1 = customer1;
    }

        public boolean hasSufficientFunds() {
            return customer1.wallet() <= customer1.getWallet();
        }


}
