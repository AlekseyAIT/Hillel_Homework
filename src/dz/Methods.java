package dz;

import java.util.Scanner;

public class Methods {
    static Scanner scan = new Scanner(System.in);

    public static long checkingIfNumIsCorrect(long number) {
            if (number < 5 || number > 20) {
                System.out.print("Type correct number! Type a number (from 5 to 20): ");
                number = scan.nextLong();

                return checkingIfNumIsCorrect(number);
            }

            return number;
    }

    public static long findingFactorial(long number, long counter, long factorial) {
        factorial = factorial * (counter + 1);

        if (counter == number - 1) {
            return factorial;
        }

        counter++;

        return findingFactorial(number, counter, factorial);
    }
}
