public class Hideout<T> {
    private T item;

    public Hideout() {
        this.item = null;
    }

    public void putIntoHideout(T toHide) {
        this.item = toHide;
    }

    public T takeFromHideout() {
        T toReturn = item;
        item = null;
        return toReturn;
    }

    public boolean isInHideout() {
        return item != null;
    }
}
