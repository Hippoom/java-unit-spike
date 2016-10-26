package spike.junit;

public class OrderHandler {

    private PricingQuery pricingQuery;

    private OrderRepository orderRepository;

    public OrderHandler() {
        pricingQuery = new PricingQuery();
        orderRepository = new OrderRepository();
    }

    public void handle(PlaceOrderCommand command) {
        double price = pricingQuery.ask(command.getItem(), command.getSize());
        Order order = new Order(command.getItem(), command.getSize(), command.getQuantity(), price);

        orderRepository.store(order);
    }
}
