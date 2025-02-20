package by.belyaev.L13_02_2025owner;

import java.util.Random;

public class PetFactory {

    private Random random = new Random();

    private static String[] names = new String[5];

    static {
        names[0] = "Барсик";
        names[1] = "Мурзик";
        names[2] = "Бакс";
        names[3] = "Боня";
        names[4] = "Анфиска";

    }

    Pet dog = new Dog("Барсик", "Собака", 8);

    Pet cat = new Cat("Бакс", "Кот", 12);
    Pet bird = new Bird("Кеша", "Попугай", 1);

    Pet[] pets = {bird, cat, dog};
        for(
    Pet pet :pets)

    {
        System.out.println(pet + " (Домашнее животное, хозяин: " + pet.getOwner());
        pet.makeSound();
        pet.move();
        pet.eat();
        pet.play();


    }
}