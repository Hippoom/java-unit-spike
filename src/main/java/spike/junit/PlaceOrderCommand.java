package spike.junit;

public class PlaceOrderCommand {
    private String item;
    private String size;
    private int quantity;

    public PlaceOrderCommand(String item, String size, int quantity) {

        this.item = item;
        this.size = size;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }
}
