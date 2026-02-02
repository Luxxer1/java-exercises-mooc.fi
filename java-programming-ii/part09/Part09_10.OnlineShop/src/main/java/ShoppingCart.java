import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
            return;
        }

        items.put(product, new Item(product, 1, price));
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
