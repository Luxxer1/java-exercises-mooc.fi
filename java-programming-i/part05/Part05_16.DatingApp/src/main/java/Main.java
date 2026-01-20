
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(29, 12, 1995);
        System.out.println(date);
        date.advance(90);
        System.out.println(date);
        date.advance();
        System.out.println(date);
    }
}
