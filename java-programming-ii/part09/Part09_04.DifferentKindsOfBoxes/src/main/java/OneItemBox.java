public class OneItemBox extends Box {
    private boolean hasItem;
    private Item item;

    public OneItemBox() { }

    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }
}
