public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        double eatTax = 2.6;

        if ((this.balance - eatTax) >= 0) {
            this.balance -= eatTax;
        }
    }

    public void eatHeartily() {
        double eatTax = 4.6;

        if ((this.balance - eatTax) >= 0) {
            this.balance -= eatTax;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else if (amount > 0) {
            this.balance += amount;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
