
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        if (size % 2 == 0) {
            return square;
        }

        int x = square.getWidth() / 2;
        int y = 0;

        int value = 1;
        int lastNumber = size * size;

        square.placeValue(x, y, value);

        while (value <= lastNumber) {
            value += 1;
            int nextX = x + 1;
            int nextY = y - 1;

            if (nextX >= square.getWidth()) nextX = 0;
            if (nextY < 0) nextY = square.getHeight() - 1;

            if (square.readValue(nextX, nextY) != 0) {
                nextX = x;
                nextY = y + 1;
            }

            square.placeValue(nextX, nextY, value);
            x = nextX;
            y = nextY;
        }

        return square;
    }
}
