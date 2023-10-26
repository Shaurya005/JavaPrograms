import java.util.Date;
import java.util.List;

class Cart {
    Long customerId;
    List<Order> orders;

    public Cart(Long customerId, List<Order> orders) {
        this.customerId = customerId;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Cart{" + "customerId=" + customerId + ", orders=" + orders + '}';
    }
}

class Order {
    int id;
    String name;
    Date date;
    List<Item> items;

    public Order(int id) {
        date = new Date();
        name = "Order - " + id;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", name='" + name + '\'' +
                ", date=" + date + ", items=" + items + '}';
    }
}

class Item {
    int id;
    String name;
    int quantity;
    Double price;

    public Item(String name, int quantity, Double price, int id) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' +
                ", quantity=" + quantity + ", price=" + price + '}';
    }
}