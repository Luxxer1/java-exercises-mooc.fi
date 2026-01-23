public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
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
}