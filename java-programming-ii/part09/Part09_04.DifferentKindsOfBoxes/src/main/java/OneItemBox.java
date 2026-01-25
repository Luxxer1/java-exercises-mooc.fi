public class OneItemBox extends Box {
    private Item item;

    public OneItemBox() { }

    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }

    public boolean isInBox(Item item) {
        return this.item.equals(item);
    }
}
