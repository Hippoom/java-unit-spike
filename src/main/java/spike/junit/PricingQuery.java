package spike.junit;

public class PricingQuery {
    public double ask(String item, String size) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (item.equals("latte")) {
            return 22.3;
        } else {
            return 0.0;
        }
    }
}
