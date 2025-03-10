package by.belyaev.L10_03_2025transport;


public class Bike extends Transport {
    private final boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
