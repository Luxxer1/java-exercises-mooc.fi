
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful

        int drawNumbers = 7;
        while (numbers.size() < drawNumbers) {
            int randomNumber = random.nextInt(40) + 1;
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

