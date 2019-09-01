import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFriend {

    @Test
    public void givenSpentZeroMoneyByChetan_WhenCalculate_ThenShouldReturnZero() {
        String name = "chetan";
        double zeroMoneyPaid = 0.0;
        double zeroMoneyToPay = 0.0;
        AmountToPay friend = new Friends(name, zeroMoneyPaid, zeroMoneyToPay);
        Assertions.assertEquals(0.0, friend.payAmount());
    }

    @Test
    public void givenSpentZeroMoneyByDarshanForTwoFriends_WhenCalculate_ThenShouldReturnZero() {
        String name = "Darshan";
        double zeroMoneyPaid = 0.0;
        double zeroMoneyToPay = 0.0;
        AmountToPay friend = new Friends(name, zeroMoneyPaid, zeroMoneyToPay);
        Assertions.assertEquals(0.0, friend.payAmount());
    }

        @Test
    public void givenSpentThreeHundredMoneyByDarshanForTwoFriends_WhenCalculate_ThenShouldReturnThreeHundred(){
        String name="Darshan";
        double threeHundredMoneyPaid = 300;
        double zeroMoneyToPay=0.0;
        AmountToPay friend = new Friends(name,threeHundredMoneyPaid,zeroMoneyToPay);
        Assertions.assertEquals(300,friend.payAmount());
    }
        @Test
    public void givenSpentZeroMoneyByBunnyForTwoFriends_WhenCalculate_ThenShouldReturnZero(){
        String name="Bunny";
        double zeroMoneyPaid = 0.0;
        double zeroMoneyToPay=0.0;
        AmountToPay friend = new Friends(name,zeroMoneyPaid,zeroMoneyToPay);
        Assertions.assertEquals(0.0,friend.payAmount());
    }

}
