package by.belyaev.L10_03_2025transport;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String licensePlate, String fuelType) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + "Вид топлива: " + fuelType;
    }
}
