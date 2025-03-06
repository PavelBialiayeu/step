package by.belyaev.L06_03_2025;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
