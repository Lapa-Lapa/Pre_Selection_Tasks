package Part_1_1;
import java.util.*;

public class Part_1_1 {

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner firstInput = getInput();
        Double firstDigit = firstInput.nextDouble();
        System.out.println("Введите +,-,* или /:");
        Scanner secondInput = getInput();
        String mathOperation = secondInput.nextLine();
        if (isValidMathOperation(mathOperation)) {
            System.out.println("Введите второе число:");
            Scanner thirdInput = getInput();
            Double secondDigit = thirdInput.nextDouble();
            printAnswer(firstDigit, secondDigit, mathOperation);
            if (mathOperation.equals("+") ) {
                System.out.println(getSumOfTwoNumbers(firstDigit, secondDigit));
            }
            if (mathOperation.equals("-")) {
                System.out.println(getDifferenceOfTwoNumbers(firstDigit, secondDigit));
            }
            if (mathOperation.equals("*")) {
                System.out.println(getMultiplyOfTwoNumbers(firstDigit, secondDigit));
            }
            if (mathOperation.equals("/")) {
                System.out.println(getDivisionOfTwoNumbers(firstDigit, secondDigit));
            }
        } else {
            System.out.println("Вы ввели символ который не предлагался для введения! Перезапутите программу.");
        }
    }

    private static Scanner getInput() {
        return new Scanner(System.in);
    }

    private static void printAnswer(Double firstNumber, Double secondNumber, String mathOperation){
        System.out.print("Ответ: " + firstNumber + mathOperation + secondNumber + " = ");
    }

    private static Double getSumOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static Double getDifferenceOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static Double getMultiplyOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static Double getDivisionOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }

    private static boolean isValidMathOperation(String mathOperation) {
        return mathOperation.equals("+") | mathOperation.equals("-") | mathOperation.equals("*") | mathOperation.equals("/");
    }
}