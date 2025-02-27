package by.belyaev.L30_01_2025;

public class Task00 {
    public static void main(String[] args) {
        Wheel[] whells = new Wheel[4];
        for (int i = 0; i < whells.length; i++) {
            whells[i] = new Wheel("Резина", 18, "Зимняя");
        }
        Car audi = new Car("Audi", "TT", 1999, whells);
        System.out.print(audi);
        WheelArray wheelArray = new WheelArray(4);
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        System.out.println(wheelArray);
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        System.out.println(wheelArray);
        wheelArray.add(new Wheel("Летняя", 17, "Запаска"));
        System.out.println(wheelArray);
        Wheel wheel = wheelArray.get(wheelArray.size - 1);
        System.out.println(wheel);
        wheelArray.sortByDiameter();
        System.out.println(wheelArray);
        wheelArray.sortByType();
        System.out.println(wheelArray);
        System.out.println(wheelArray.getSize());
        System.out.println(wheelArray.getWheels());
    }
}