package by.belyaev.L13_02_2025owner;

import by.belyaev.L30_01_2025.Wheel;

import java.util.Random;

public class Owner {

    private int id;
    private String name;
    private String surName;
    private static int size;
    private String sex;

    private static int totalOwners = 0;

    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private static String[] sexs = new String[2];
    static Pet[] pets = new Pet[0];


    private Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");

        surNames[0] = "Гуща";
        surNames[1] = "Галузо";
        surNames[2] = "Тарасенко";
        surNames[3] = "Борисенко";
        surNames[4] = "Петренко";

        names[0] = "Паша";
        names[1] = "Аня";
        names[2] = "Олег";
        names[3] = "Оля";
        names[4] = "Коля";

        sexs[0] = "мужской";
        sexs[1] = "женский";
    }

    public Owner() {
        this.id = ++totalOwners;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.sex = sexs[random.nextInt(sexs.length)];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }


    public void addPet(Pet pet) {
        if (size < pets.length) {
            pets[size++] = pet;
        } else {
            Pet[] pets1 = new Pet[pets.length + 1];
            for (int i = 0; i < pets.length; i++) {
                pets1[i] = pets[i];
            }
            pets1[size++] = pet;
            pets = pets1;
            pet.setOwner(this);
        }
    }

    public static String[] getSexs() {
        return sexs;
    }

    @Override
    public String toString() {
        return name + " " + surName + " : пол " + sex + " ";
    }
}