package by.belyaev.L03_03_2025;

import java.util.*;

public class Task00 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        stringList.add("Дима");
        stringList.add("Паша");

        stringList2.add("Оля");
        stringList2.add("Аня");


        System.out.println("Размер stringList =>" + stringList.size());
        stringList.addAll(stringList2);
        System.out.println("Размер stringList =>" + stringList.size());
        System.out.println(stringList);

        stringList.clear();
        System.out.println(stringList);
        System.out.println(stringList.size());

        stringList.add("Андрей");
        stringList.add("Олег");
        boolean isPashaContains = stringList.contains("Паша");
        System.out.println(isPashaContains);
        boolean containsAll = stringList.containsAll(stringList2);
        System.out.println(containsAll);
        if (!stringList.isEmpty()) {
            System.out.println();
        }
        boolean equals = stringList.equals(stringList2);
        System.out.println(equals);

        String s = stringList.get(0);
        System.out.println(s);

        int i = stringList.indexOf("Паша");
        System.out.println(i);

        stringList.remove("Паша");
        System.out.println(stringList);

        stringList.reversed();

        stringList.set(0, "Катя");
        String[] array = stringList.toArray(new String[0]);
        List<String> k = new ArrayList<>(20);

        System.out.println(stringList);

        test();


    }

    public static void test() {
        Car audi = new Car("Audi", 1988);
        Car bmw = new Car("BMW", 2005);
        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        System.out.println(cars);
                for (Car car : cars) {
            if (car.getYear() == 2005) {
                System.out.println(car);
            }
        }

                Iterator<Car> iterator = cars.iterator();
                while (iterator.hasNext()) {
                    Car next = iterator.next();
                    if(next.getYear() == 2005) {
                        iterator.remove();
                        break;
                    }
                }
        System.out.println(cars);
    }
}