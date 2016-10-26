package spike.junit;

import org.junit.Test;

public class DependencyInjectionSpike {

    private OrderHandler subject = new OrderHandler();

    @Test
    public void placeOrder() {

        subject.handle(new PlaceOrderCommand("latte", "large", 1));

    }

}
