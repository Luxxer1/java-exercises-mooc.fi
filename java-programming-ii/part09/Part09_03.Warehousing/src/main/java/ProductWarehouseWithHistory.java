public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + getName() + "\n" +
                "History: " + changeHistory + "\n" +
                "Largest amount of product: " + changeHistory.maxValue() + "\n" +
                "Smallest amount of product: " + changeHistory.minValue() + "\n" +
                "Average: " + changeHistory.average()
        );
    }
}