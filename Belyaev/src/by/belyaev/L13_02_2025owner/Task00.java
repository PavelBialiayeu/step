package by.belyaev.L13_02_2025owner;


public class Task00 {
    public static void main(String[] args) {

        Pet dog = new Dog("Барсик", "Собака", 8);
        Pet cat = new Cat("Бакс", "Кот", 12);
        Pet bird = new Bird("Кеша", "Попугай", 1);
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        owner1.addPet(dog);
        owner1.addPet(cat);
        owner2.addPet(bird);

        Pet[] pets = {bird, cat, dog};
        for (Pet pet : pets) {
            System.out.println(pet + " (Домашнее животное, хозяин: " + pet.getOwner());
            pet.makeSound();
            pet.move();
            pet.eat();
            pet.play();
            System.out.println();
        }

        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());

    }
}