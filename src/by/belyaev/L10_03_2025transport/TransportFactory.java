package by.belyaev.L10_03_2025transport;


import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static final Random random = new Random();

    private final static List<String> stringList = List.of("BMW", "Audi", "Volvo");
    private final static  List<String> fuelType = List.of("Дизель", "Бензин", "Газ-бензин");
    private final static List<String> licensePlate = List.of("7455 IK-2", "9698 AM-2", "3542 KK-2");


    public static Transport next() {
        int i = random.nextInt(3);
        if (i == 2) {
            return new Bike(stringList.get(random.nextInt()), random.nextInt(330), licensePlate.get(random.nextInt()), random.nextBoolean());
        } else if (i == 1) {
            return new Car(stringList.get(random.nextInt()), random.nextInt(270), licensePlate.get(random.nextInt()), fuelType.get(random.nextInt()));
        } else {
            return new Truck(stringList.get(random.nextInt()), random.nextInt(220), licensePlate.get(random.nextInt()), random.nextInt(10));
        }
    }
}