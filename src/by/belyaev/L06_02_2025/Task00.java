package by.belyaev.L06_02_2025;

public class Task00 {

    public static void main(String[] args) {

        ElectronicDevice laptop = new Laptop("Acer", "Aspire", 65, 6, "Ноутбук");
        ElectronicDevice smartphone = new Smartphone("Nokia", "Lumia", 20, 15, "Смартфон");
        ElectronicDevice television = new Television("Samsung", "UE5300AK2000", 100, 55, "Телевизор");

        ElectronicDevice[] electronicDevices = {laptop, smartphone, television};

        for (ElectronicDevice device : electronicDevices) {

            System.out.println(device.toString());
            System.out.println("Состояние: " + device.getStatus());
            device.turnOn();
            System.out.println("Состояние: " + device.getStatus());
            device.turnOff();
            System.out.println("Состояние: " + device.getStatus());
        }
    }
}