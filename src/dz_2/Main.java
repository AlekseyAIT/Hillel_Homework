package dz_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Typing characteristics of the first car

        System.out.println("Type characteristics of the first car: " +
                "(in order: brand, model, weight, motor size and max speed): ");

        Car firstCar = fillCarCharacteristics(scan);


        //Typing characteristics of the second car

        System.out.println("Type characteristics of the second car: " +
                "(in order: brand, model, weight, motor size and max speed): ");

        Car secondCar = fillCarCharacteristics(scan);

        //Compare if the cars are the same

        System.out.println("Cars are the same: " + firstCar.equals(secondCar));

        //Find out which car is gonna win

        System.out.println(findingWinnerCar(firstCar, secondCar));


    }

    private static Car fillCarCharacteristics(Scanner scanner) {
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        String weight = scanner.nextLine();
        String motorSize = scanner.nextLine();
        String maxSpeed = scanner.nextLine();

        return new Car(brand, model, weight, motorSize, maxSpeed);
    }

    private static String findingWinnerCar(Car firstCar, Car secondCar) {

        if (firstCar.getMaxSpeed() > secondCar.getMaxSpeed() && firstCar.getMotorSize() > secondCar.getMotorSize() ||
                firstCar.getMaxSpeed() == secondCar.getMaxSpeed() && firstCar.getMotorSize() > secondCar.getMotorSize() ||
                firstCar.getMaxSpeed() > secondCar.getMaxSpeed() && firstCar.getMotorSize() == secondCar.getMotorSize()) {
            return firstCar.getBrand() + " " + firstCar.getModel() + " is going to win!";
        }
        if (firstCar.getMaxSpeed() < secondCar.getMaxSpeed() && firstCar.getMotorSize() < secondCar.getMotorSize() ||
                firstCar.getMaxSpeed() == secondCar.getMaxSpeed() && firstCar.getMotorSize() < secondCar.getMotorSize() ||
                firstCar.getMaxSpeed() < secondCar.getMaxSpeed() && firstCar.getMotorSize() == secondCar.getMotorSize()) {
            return secondCar.getBrand() + " " + secondCar.getModel() + " is going to win!";
        }

        return "Both cars have chance to win! It will be exciting race!";
    }


}
