package by.belyaev.L06_03_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static final Random random = new Random();

    private final static  List<String> stringList = List.of("BMW", "Audi", "Volvo");
    private final static  List<String> fuelType = List.of("Дизель", "Бензин", "Газ-бензин");


    public static Transport next() {
        int i = random.nextInt(3);
        if (i == 2) {
            return new Bike(stringList.get(random.nextInt()), random.nextInt(330), random.nextBoolean());
        } else if (i == 1) {
            return new Car(stringList.get(random.nextInt()), random.nextInt(270), fuelType.get(random.nextInt()));
        } else {
            return new Truck(stringList.get(random.nextInt()), random.nextInt(220), random.nextInt(10));
        }
    }
}