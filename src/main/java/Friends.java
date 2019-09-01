public class Friends implements AmountToPay {
    private final String name;
    private final double moneyPaid;
    private final double moneyToPay;

    public Friends(String name, double moneyPaid, double moneyToPay) {
        this.name = name;
        this.moneyPaid = moneyPaid;
        this.moneyToPay = moneyToPay;

    }

    @Override

    public double payAmount() {
        return moneyPaid;
    }
}
