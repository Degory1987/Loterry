package main.input;

import main.messageprovider.MessageProvider;
import java.util.*;

public class UserNumbersProvider {

    public void getUserNumbers(int HOW_MANY_NUMBERS, List<Integer> givenNumbers) {
        System.out.println(MessageProvider.USER_INPUT_NUMBER);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < HOW_MANY_NUMBERS; i++) {
            int userNumber = scanner.nextInt();
            if (!isInRange(userNumber)) {
                System.out.println(MessageProvider.WRONG_NUMBER);
                i--;
            } else if (givenNumbers.contains(userNumber)) {
                System.out.println(MessageProvider.NUMBER_EXISTS);
                i--;
            } else {
                givenNumbers.add(userNumber);
            }
        }
        scanner.close();
    }

    public static boolean isInRange(int number) {
        return number > 0 && number < 99;
    }

    public void displayGivenNumber(List<Integer> givenNumbers) {
        System.out.println(MessageProvider.CHOSEN_NUMBERS);
        for (Integer number : givenNumbers) {
            System.out.print(number + " ");
        }
    }


}
