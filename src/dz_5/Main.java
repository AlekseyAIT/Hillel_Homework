package dz_5;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Auto automaticCar = new Automatic(123, 123, 123, "S", "S");
        Auto mechanicalCar = new Mechanical(123, 123, 123, "S", "S");

        LinkedList<String> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();


        checkingClass(automaticCar);
        checkingClass(mechanicalCar);
    }

    public static void checkingClass(Auto car) {
        if (car instanceof Automatic) {
            Automatic automatic = new Automatic(123, 123, 123, "S", "S");
            automatic.someMethod();
        } else {
            Mechanical mechanical = new Mechanical(123, 123, 123, "S", "S");
            mechanical.someMethod();
        }
    }
}
