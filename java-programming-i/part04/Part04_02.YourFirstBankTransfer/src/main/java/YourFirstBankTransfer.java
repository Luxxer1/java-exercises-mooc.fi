
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewAcc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        
        matthewAcc.withdrawal(100);
        myAcc.deposit(100);
        
        System.out.println(matthewAcc);
        System.out.println(myAcc);
    }
}
