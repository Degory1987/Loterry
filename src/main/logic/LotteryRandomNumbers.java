package main.logic;

import main.messageprovider.MessageProvider;
import java.util.Random;
import java.util.Set;
import static main.config.LoteryGameConfig.HOW_MANY_NUMBERS;

public class LotteryRandomNumbers {

    public void setRandomNumbers(Set<Integer> randomNumbers) {
        for (int i = 0; i < HOW_MANY_NUMBERS; i++) {
            Random random = new Random();
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println(MessageProvider.RANDOM_NUMBERS);
        displayRandomNumbers(randomNumbers);
    }

    public void displayRandomNumbers(Set<Integer> set) {
        for (Integer number : set) {
            System.out.print(number + " ");
        }
    }
}
