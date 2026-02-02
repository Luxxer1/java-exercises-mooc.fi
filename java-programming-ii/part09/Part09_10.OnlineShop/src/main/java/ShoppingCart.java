import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
            return;
        }

        cart.put(product, new Item(product, 1, price));
    }

    public int price() {
        if (cart.isEmpty()) {
            return 0;
        }

        int value = 0;
        for (Item item: cart.values()) {
            value += item.price();
        }

        return value;
    }

    public void print() {
        for (Item item: cart.values()) {
            System.out.println(item);
        }
    }
}
