
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMeal = 2.5;

        if (payment < affordableMeal) {
            return payment;
        }

        this.money += affordableMeal;
        this.affordableMeals += 1;
        return payment - affordableMeal;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double affordableMeal = 2.5;

        if (card.balance() < affordableMeal) {
            return false;
        }

        card.takeMoney(affordableMeal);
        this.affordableMeals += 1;
        return true;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartyMeal = 4.3;

        if (payment < heartyMeal) {
            return payment;
        }

        this.money += heartyMeal;
        this.heartyMeals += 1;
        return payment - heartyMeal;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double heartyMeal = 4.3;

        if (card.balance() < heartyMeal) {
            return false;
        }

        card.takeMoney(heartyMeal);
        this.heartyMeals += 1;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum <= 0) {
            return;
        }

        this.money += sum;
        card.addMoney(sum);
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
