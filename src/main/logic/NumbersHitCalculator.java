package main.logic;

import main.messageprovider.MessageProvider;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class NumbersHitCalculator {


    public void listCompare(List<Integer> userGivenNumbers, List<Integer> randomNumbers) {
        List<Integer> hitNumbers = new LinkedList<>();
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
