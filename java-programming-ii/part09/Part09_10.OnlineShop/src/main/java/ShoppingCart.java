import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        items.putIfAbsent(product, new Item(product, 1, price));
        items.get(product).increaseQuantity();
    }

    public int price() {
        if (items.isEmpty()) {
            return 0;
        }

        int value = 0;
        for (Item item: items.values()) {
            value += item.price();
        }

        return value;
    }

    public void print() {
        for (Item item: items.values()) {
            System.out.println(item);
        }
    }
}
