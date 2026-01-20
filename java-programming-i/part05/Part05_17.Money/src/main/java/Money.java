
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money((this.euros() + addition.euros()), (this.cents() + addition.cents()));
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros() - decreaser.euros();
        int newCents = this.cents() - decreaser.cents();

        // se newCents for menor que 0, dimimuir newEuros
        if (newCents < 0) {
            newEuros -= 1;
            newCents += 100;
        }

        if (Double.parseDouble(newEuros + "." + newCents) < 0) {
            return new Money(0, 0);
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        double thisMoney = Double.parseDouble(this.euros() + "." + this.cents());
        double comparedMoney = Double.parseDouble(compared.euros + "." + compared.cents);

        return thisMoney < comparedMoney;
    }

}
