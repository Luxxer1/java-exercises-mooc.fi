
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        if (size % 2 == 0) {
            return square;
        }

        int x = square.getWidth() / 2;
        int y = 0;
        int value = 1;

        square.placeValue(x, y, value);

        while (!square.isMagicSquare()) {

        }

        return square;
    }
}
