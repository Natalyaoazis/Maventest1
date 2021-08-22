public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean regestered = true;
        long expected = 30;
        long actual = service.calculate(amount,regestered);
            }
}
