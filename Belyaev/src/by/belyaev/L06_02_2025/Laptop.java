package by.belyaev.L06_02_2025;

public class Laptop extends ElectronicDevice {

    private int timeUse;
    private String name;

    public Laptop(String brand, String model, int power, int timeUse, String name) {
        super(brand, model, power);
        this.timeUse = timeUse;
        this.name = name;
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
        return super.toString() + " время работы ноутбука " + timeUse + " часов";
    }

    @Override
    public String getStatus() {
        return name + " " + super.getStatus();
    }
}