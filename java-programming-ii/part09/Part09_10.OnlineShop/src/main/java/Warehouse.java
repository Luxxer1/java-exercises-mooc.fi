import java.util.Map;
import java.util.HashMap;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int value = stock(product);
        if (value == 0) {
            return false;
        }

        stocks.replace(product, value - 1);
        return true;
    }
}
