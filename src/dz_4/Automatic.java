package dz_4;

public class Automatic implements Auto {
    private final int weight;
    private final int maxSpeed;
    private final int vinNum;
    private final String brand;
    private final String name;

    public Automatic(int weight, int maxSpeed, int vinNum, String brand, String name) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.vinNum = vinNum;
        this.brand = brand;
        this.name = name;
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
        return name;
    }

    @Override
    public void drive() {

    }

    @Override
    public void turn(String direction) {

    }

    @Override
    public void changeGear(String gear) {
        System.out.println("Передача автомата переключена на: " + gear);
    }

    @Override
    public void turnOnLights() {

    }
}
