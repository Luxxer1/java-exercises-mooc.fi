public class MisplacingBox extends Box {
    private Item item;

    public MisplacingBox() { }

    @Override
    public void add(Item item) {
        this.item = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
