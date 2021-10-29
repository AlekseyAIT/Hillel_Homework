package cars;

import java.util.Locale;

public class Car {
    private String brand;
    private String model;
    private int weight;
    private int motorSize;
    private int maxSpeed;

    public Car(String brand, String model, String weight, String motorSize, String maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.weight = Integer.parseInt(weight);
        this.motorSize = Integer.parseInt(motorSize);
        this.maxSpeed = Integer.parseInt(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getMotorSize() {
        return motorSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!brand.toLowerCase(Locale.ROOT).equals(car.brand.toLowerCase(Locale.ROOT))) return false;
        return model.equals(car.model);
    }
}
