import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void givenSpentThreeHundredMoneyByDarshanForTwoFriends_WhenCalculate_ThenShouldReturnThreeHundred() {
        String name = "Darshan";
        double threeHundredMoneyPaid = 300;
        double zeroMoneyToPay = 0.0;
        AmountToPay friend = new Friends(name, threeHundredMoneyPaid, zeroMoneyToPay);
        Assertions.assertEquals(300, friend.payAmount());
    }

    @Test
    public void givenSpentZeroMoneyByBunnyForTwoFriends_WhenCalculate_ThenShouldReturnZero() {
        String name = "Bunny";
        double zeroMoneyPaid = 0.0;
        double zeroMoneyToPay = 0.0;
        AmountToPay friend = new Friends(name, zeroMoneyPaid, zeroMoneyToPay);
        Assertions.assertEquals(0.0, friend.payAmount());
    }

    @Test
    public void givenSpentFiveHundredMoneyByBunnyForTwoFriends_WhenCalculate_ThenShouldReturnFiveHundred() {
        String name = "Bunny";
        double fiveHundredMoneyPaid = 500;
        double zeroMoneyToPay = 0.0;
        AmountToPay friend = new Friends(name, fiveHundredMoneyPaid, zeroMoneyToPay);
        Assertions.assertEquals(500, friend.payAmount());
    }

    @Test
    public void givenSpentFiveHundredMoneyByBunnyForTwoFriends_WhenCalculate_ThenShouldReturnTwoFifty() {
        List<String> friendsList = new ArrayList<>();
        friendsList.add("Chetan");
        friendsList.add("Darshan");
        Friends friend = new Friends("Bunny", 500, friendsList);
        Assertions.assertEquals(250, friend.calculateExpensesSpentForFriends());
    }


    @Test
    public void givenSpentThreeHundredMoneyByDarshanForTwoFriends_WhenCalculate_ThenShouldReturnOneFifty() {
        List<String> friendsList = new ArrayList<>();
        friendsList.add("Alex");
        friendsList.add("Bunny");
        Friends friend = new Friends("Darshan", 300, friendsList);
        Assertions.assertEquals(150, friend.calculateExpensesSpentForFriends());
    }

    @Test
    public void givenSpentundredMoneyByAlexForFourFriends_WhenCalculate_ThenShouldReturnTwentyFive() {
        List<String> friendsList = new ArrayList<>();
        friendsList.add("Alex");
        friendsList.add("Bunny");
        friendsList.add("Chetan");
        friendsList.add("Darshan");
        Friends friend = new Friends("Alex", 100, friendsList);
        Assertions.assertEquals(25, friend.calculateExpensesSpentForFriends());
    }
    @Test
    public void givenSpentHundredMoneyByAlexForFourFriends_WhenCalculate_ThenShouldReturnSeventyFive() {
        List<String> friendsList = new ArrayList<>();
        friendsList.add("Alex");
        friendsList.add("Bunny");
        friendsList.add("Chetan");
        friendsList.add("Darshan");
        Friends friend = new Friends("Alex", 100, friendsList);
        Assertions.assertEquals(75, friend.calculateExpensesForAll());
    }


}
