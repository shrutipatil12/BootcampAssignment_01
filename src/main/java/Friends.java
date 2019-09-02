import java.util.List;

public class Friends implements AmountToPay {
    private final String name;
    private double moneyToPay;
    private double moneyPaid;
    private List<String> listOfFriends;

    public Friends(String name, double moneyPaid, List<String> listOfFriends) {
        this.name = name;
        this.moneyPaid = moneyPaid;
        this.listOfFriends = listOfFriends;

    }

    public Friends(String name, double moneyPaid, double moneyToPay) {

        this.name = name;
        this.moneyPaid = moneyPaid;
        this.moneyToPay = moneyToPay;
    }

    @Override

    public double payAmount() {
        return moneyPaid;
    }

    public int calculateExpensesSpentForFriends() {
        int moneyPaidForFriends = 0;
        int amountDistributed = listOfFriends.size();
        moneyPaidForFriends = (int) (moneyPaid / amountDistributed);
        return moneyPaidForFriends;

    }


}
