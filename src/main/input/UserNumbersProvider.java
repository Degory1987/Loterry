package main.input;

import main.messageprovider.MessageProvider;
import java.util.*;

import static main.config.LoteryGameConfig.HOW_MANY_NUMBERS;

public class UserNumbersProvider {

    public void getUserNumbers(Set<Integer> givenNumbers) {
        System.out.println(MessageProvider.USER_INPUT_NUMBER);
        Scanner scanner = new Scanner(System.in);
        while (areTheAllNumbers(givenNumbers)) {
            int userNumber = scanner.nextInt();
            if (!isInRange(userNumber)) {
                System.out.println(MessageProvider.WRONG_NUMBER);
            } else if (givenNumbers.contains(userNumber)) {
                System.out.println(MessageProvider.NUMBER_EXISTS);
            } else {
                givenNumbers.add(userNumber);
            }
        }
        scanner.close();
    }

    public static boolean isInRange(int number) {
        return number > 0 && number < 99;
    }

    public boolean areTheAllNumbers(Set<Integer> numbers) {
        return numbers.size() < HOW_MANY_NUMBERS;
    }

    public void displayGivenNumber(Set<Integer> givenNumbers) {
        System.out.println(MessageProvider.CHOSEN_NUMBERS);
        for (Integer number : givenNumbers) {
            System.out.print(number + " ");
        }
    }
}
