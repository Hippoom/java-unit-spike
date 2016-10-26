package spike.junit;

public class Order {
    private String item;
    private String size;
    private int quantity;
    private double price;

    public Order(String item, String size, int quantity, double price) {
        this.item = item;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
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

    public double getPrice() {
        return price;
    }
}
