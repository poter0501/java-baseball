package baseball;

import camp.nextstep.edu.missionutils.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    private static void printStartText(String txt) {
        System.out.println(txt);
    }

    private static List<Integer> createRandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    private static void printAskInputText(String txt) {
        System.out.printf(txt);
    }

    private static String getInput() {
        String input = "";
        input = Console.readLine();
        return input;
    }

    private static void ableToParseInt(String input) {
        try {
            int temp = 0;
            temp = Integer.parseInt(input);
        } catch (Exception e) {
            IllegalArgumentException exception = new IllegalArgumentException();
            throw exception;
        }
    }

    private static void checkInputThreeDifferentNumber(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        if (numbers.size() != 3 || numberSet.size() != 3) {
            IllegalArgumentException exception = new IllegalArgumentException();
            throw exception;
        }
    }

    private static void checkInputOneOrTwo(String input) {
        int inputCode = 0;
        ableToParseInt(input);
        inputCode = Integer.parseInt(input);
        if (!(inputCode == 1 || inputCode == 2)) {
            throw new IllegalArgumentException();
        }
    }

    private static void printComparisonResult(int strikeCount, int ballCount) {
        String printText = "";
        String ballCountText = "";
        String strikeCountText = "";
        if (strikeCount == 0 && ballCount == 0) {
            printText = "낫싱";
        }
        if (ballCount != 0) {
            ballCountText = Integer.toString(ballCount) + "볼";
        }
        if (strikeCount != 0 && strikeCount != 3) {
            strikeCountText = Integer.toString(ballCount) + "스트라이크";
        }
        printText = printText + ballCountText + " " + strikeCountText;
        System.out.println(printText);
    }
}
