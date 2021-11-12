package calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        BigDecimal sum, secondNum;

        System.out.println("Type a number then an operation ( +, -, *, / or : ), when you decide to count up, type '=' after last number.");
        sum = new BigDecimal(scanner.nextLine());

        while (true) {
            operation = scanner.nextLine();
            if (operation.equals("=")) {
                break;
            }
            secondNum = new BigDecimal(scanner.nextLine());

            sum = countingUp(sum, secondNum, operation);
        }

        System.out.println("The answer: " + sum);
    }

    public static BigDecimal countingUp(BigDecimal a, BigDecimal b, String operation) {
        BigDecimal sum;
        switch (operation) {
            case "+":
                sum = a.add(b);
                break;
            case "-":
                sum = a.subtract(b);
                break;
            case "*":
                sum = a.multiply(b);
                break;
            case "/":
                sum = a.divide(b);
                break;
            case ":":
                sum = a.divide(b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return sum;
    }
}
