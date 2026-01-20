
public class Main {

    public static void main(String[] args) {
        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(10);
        terminal.addMoneyToCard(card, 10);
        System.out.println(card.balance());
    }
}

