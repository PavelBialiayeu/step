package by.belyaev.L10_03_2025transport;


public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int loadCapacity) {
        super(model, speed, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Грузоподъемность: " + loadCapacity;
    }
}