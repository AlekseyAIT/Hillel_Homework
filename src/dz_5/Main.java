package dz_5;

public class Main {
    public static void main(String[] args) {
        Auto automaticCar = new Automatic(123, 123, 123, "S", "S");
        Auto mechanicalCar = new Mechanical(123, 123, 123, "S", "S");

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
