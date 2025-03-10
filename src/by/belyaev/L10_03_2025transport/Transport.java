package by.belyaev.L10_03_2025transport;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport> {
    private final String model;
    private final int speed;
    private final String licensePlate;


    public Transport(String model, int speed, String licensePlate) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public String toString() {
        return "Транспортное средство: " + model + " ." + "Макмимальная скорость: " + speed + " км в час";
    }

    @Override
    public int compareTo(Transport o) {
        int modelCompare = this.model.compareTo(o.model);
        if (modelCompare != 0) {
            return modelCompare;
        }
        return Integer.compare(this.speed, o.speed);
    }
}