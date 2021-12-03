package dz_5;

public class Mechanical implements Auto {
    private int weight;
    private int maxSpeed;
    private int vinNumber;
    private String brand;
    private String model;

    public Mechanical(int weight, int maxSpeed, int vinNumber, String brand, String model) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void drive() {

    }

    @Override
    public void turn(String direction) {

    }

    @Override
    public void changeGear(String gear) {

    }

    public void someMethod() {
        System.out.println("Это метод класса Mechanical!");
    }
}
