package dz;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number (from 5 to 20): ");
        long num = scan.nextLong();

        num = Methods.checkingIfNumIsCorrect(num);

        System.out.println("Factorial of " + num + " is " +
                Methods.findingFactorial(num, 1, 1));
    }
}
