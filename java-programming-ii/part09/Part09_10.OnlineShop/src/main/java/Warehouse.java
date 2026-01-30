import java.util.Map;
import java.util.HashMap;

public class Warehouse {
    Map<String, Integer> prices;
    Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }
}
