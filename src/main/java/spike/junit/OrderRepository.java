package spike.junit;

public class OrderRepository {
    public void store(Order order) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
