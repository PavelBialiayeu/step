package by.belyaev.L23_01_2025;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        createBilding();

    }


        public static void createBilding() {
            Bilding bilding = new Bilding();
            bilding.street = "Короткевича";
            bilding.material = "дерева";
            bilding.dor = 5;
            bilding.windows = 10;
            Bilding bilding2 = new Bilding("Леонова", "кирпича", 15, 73);
            System.out.println(bilding.getDescription());
            System.out.println(bilding2.getDescription());
        }
    }