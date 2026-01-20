public class Container {
    private int container;
    private int maxLiquid;

    public Container() {
        this.container = 0;
        this.maxLiquid = 100;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (isPositive(amount)) {
            if (this.container + amount < maxLiquid) {
                this.container += amount;
            } else {
                this.container = maxLiquid;
            }
        }
    }

    public void remove(int amount) {
        if (isPositive(amount)) {
            if (this.container - amount > 0) {
                this.container -= amount;
            } else {
                this.container = 0;
            }
        }
    }

    public String toString() {
        return this.contains() + "/" + this.maxLiquid;
    }

    private boolean isPositive(int value) {
        return value > 0;
    }
}