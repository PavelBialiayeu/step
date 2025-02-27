package by.belyaev.L13_02_2025owner;

import java.util.Random;

public class Owner {

    private int id;

    private String name;

    private String surName;

    private String sex;

    private Pet[] pets = new Pet[0];

    private static int totalOwners = 0;

    private final static Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");
    }

    public Owner(String firstName, String lastName) {
        this.id = ++totalOwners;
        this.name = firstName;
        this.surName = lastName;
        this.sex = random.nextBoolean() ? "Male" : "Female";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    public void addPet(Pet pet) {
        Pet[] pets1 = new Pet[pets.length + 1];
        System.arraycopy(pets, 0, pets1, 0, pets.length);
        pets1[pets1.length - 1] = pet;
        pets = pets1;
        pet.setOwner(this);
    }

    @Override
    public String toString() {
        return name + " " + surName + ", пол " + sex + " ;" + "Количество животных " + pets.length;
    }

}