package main.logic;

import main.messageprovider.MessageProvider;

import java.util.HashSet;
import java.util.Set;

public class NumbersHitCalculator {

    public void listCompare(Set<Integer> userGivenNumbers, Set<Integer> randomNumbers) {
        Set<Integer> hitNumbers = new HashSet<>();
        for (Integer userGivenNumber : userGivenNumbers) {
            for (Integer randomNumber : randomNumbers) {
                if (userGivenNumber.equals(randomNumber)) {
                    hitNumbers.add(userGivenNumber);
                }
            }
        }
        System.out.println(MessageProvider.HIT_NUMBERS + hitNumbers);
        if (hitNumbers.containsAll(randomNumbers)) {
            System.out.println(MessageProvider.WIN_GAME);
        } else {
            System.out.println(MessageProvider.LOOSE_GAME_MESSAGE);
        }
    }
}
