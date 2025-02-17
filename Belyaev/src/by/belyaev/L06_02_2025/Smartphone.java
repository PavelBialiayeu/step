package by.belyaev.L06_02_2025;

public class Smartphone extends ElectronicDevice {

    private int camera;
    private String smart;

    public Smartphone(String brand, String model, int power, int camera, String smart) {
        super(brand, model, power);
        this.camera = camera;
        this.smart = smart;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return super.toString() + " разрешение камеры " + camera + " Мп";
    }

    @Override
    public String getStatus() {
        return smart + " " + super.getStatus();
    }
}