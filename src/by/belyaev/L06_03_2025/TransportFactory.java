package by.belyaev.L06_03_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static Random random = new Random();

    private static List<String> stringList = List.of("BMW", "Audi", "Volvo");
    private static List<String> fuelList = List.of("Дизель", "Бензин", "Газ-бензин");


    public static Transport next() {
        int i = random.nextInt(3);
        if (i == 2) {
            Bike bike = new Bike(random.nextInt(stringList), random.nextInt(330), random.nextBoolean());
            return bike;
        } else if (i == 1) {
            Car car = new Car(random.nextInt(stringList), random.nextInt(270), random.nextInt());
            return car;
        } else {
            Truck truck = new Truck(random.nextInt(stringList), random.nextInt(220), random.nextInt(fuelList));
            return truck;
        }
    }
}