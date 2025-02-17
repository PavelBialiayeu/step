package by.belyaev.L06_02_2025;

public class Television extends ElectronicDevice {

    private int size;
    private String telek;

    public Television(String brand, String model, int power, int size, String telek) {
        super(brand, model, power);
        this.size = size;
        this.telek = telek;
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
        return super.toString() + " диагональ экрана " + size + " дюймов";
    }

    @Override
    public String getStatus() {
        return telek + " " + super.getStatus();
    }
}