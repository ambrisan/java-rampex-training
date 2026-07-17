package Day_16.Home_Task;

import java.util.Objects;

public class Order {
    private int id;
    private String itemName;
    private double price;
    private String status;

    public Order() {}

    public Order(int id, String itemName, double price, String status) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{id=" + id + ", itemName='" + itemName + "', price=" + price + ", status='" + status + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(order.price, price) == 0 && Objects.equals(itemName, order.itemName) && Objects.equals(status, order.status);
    }
}
