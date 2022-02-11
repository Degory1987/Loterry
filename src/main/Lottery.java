package main;

import main.input.UserNumbersProvider;
import main.logic.LotteryRandomNumbers;
import main.logic.NumbersHitCalculator;
import main.messageprovider.MessageProvider;

import java.util.*;

import static main.config.LoteryGameConfig.HOW_MANY_NUMBERS;

public class Lottery {

    public static void main(String[] args) {

        List<Integer> givenNumbers = new LinkedList<>();
        List<Integer> randomNumbers = new LinkedList<>();

        UserNumbersProvider userNumbersProvider = new UserNumbersProvider();
        LotteryRandomNumbers lotteryRandomNumbers = new LotteryRandomNumbers();
        NumbersHitCalculator numbersHitCalculator = new NumbersHitCalculator();

        GameStartInfo();
        userNumbersProvider.getUserNumbers(HOW_MANY_NUMBERS, givenNumbers);
        userNumbersProvider.displayGivenNumber(givenNumbers);
        lotteryRandomNumbers.setRandomNumbers();
        numbersHitCalculator.listCompare(givenNumbers,randomNumbers);

    }

    private static void GameStartInfo() {
        System.out.println(MessageProvider.GAME_START + MessageProvider.RULES_OF_GAME);
        System.out.println("______________________________________________");
    }


}
