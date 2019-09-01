import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFriend {

    @Test
    public void givenZeroMoneyByChetan_WhenCalculate_ThenShouldReturnZero(){
        String name="chetan";
        double zeroMoneyPaid = 0.0;
        double zeroMoneyToPay=0.0;
        Friends friend = new Friends(name,zeroMoneyPaid,zeroMoneyToPay);
        Assertions.assertEquals(0,friend.CalculateExpenses());
    }
}
