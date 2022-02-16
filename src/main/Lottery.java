package main;

import main.input.UserNumbersProvider;
import main.logic.LotteryRandomNumbers;
import main.logic.NumbersHitCalculator;
import main.messageprovider.MessageProvider;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {

        Set<Integer> givenNumbers = new HashSet<>();
        Set<Integer> randomNumbers = new HashSet<>();

        UserNumbersProvider userNumbersProvider = new UserNumbersProvider();
        LotteryRandomNumbers lotteryRandomNumbers = new LotteryRandomNumbers();
        NumbersHitCalculator numbersHitCalculator = new NumbersHitCalculator();

        GameStartInfo();
        userNumbersProvider.getUserNumbers(givenNumbers);
        userNumbersProvider.displayGivenNumber(givenNumbers);
        lotteryRandomNumbers.setRandomNumbers(randomNumbers);
        numbersHitCalculator.listCompare(givenNumbers,randomNumbers);
    }

    private static void GameStartInfo() {
        System.out.println(MessageProvider.GAME_START + MessageProvider.RULES_OF_GAME);
        System.out.println("______________________________________________");
    }
}
