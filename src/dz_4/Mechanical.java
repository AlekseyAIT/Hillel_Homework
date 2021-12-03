package dz_4;

public class Mechanical implements Auto {
    private final int weight;
    private final int maxSpeed;
    private final int vinNum;
    private final String brand;
    private final String model;

    public Mechanical(int weight, int maxSpeed, int vinNum, String brand, String model) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.vinNum = vinNum;
        this.brand = brand;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getVinNum() {
        return vinNum;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
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
        System.out.println("Передача механики переключена на: " + gear);
    }

    @Override
    public void turnOnLights() {

    }
}
