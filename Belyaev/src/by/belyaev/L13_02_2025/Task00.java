package by.belyaev.L13_02_2025;


public class Task00 {
    public static void main(String[] args) {

        Pet dog = new Dog("Барсик", "Собака", 8, "Виталик");
        Pet cat = new Cat("Бакс", "Кот", 12, "Паша");
        Pet bird = new Bird("Кеша", "Попугай", 1, "Анна");
        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");

        Pet[] pets = {bird, cat, dog};
        for (Pet pet : pets) {
            System.out.println(pet + " (Домашнее животное, хозяин: " + pet.getNameOwner() + " " + pet.getOwnerSurName() + ")");
            pet.makeSound();
            pet.move();
            pet.eat();
            pet.play();
            System.out.println();
        }

        WildAnimal[] wildAnimals = {lion};
        for (WildAnimal wildAnimal : wildAnimals) {
            System.out.println(wildAnimal + " (Дикое животное. Среда обитания: " + wildAnimal.getHome() + ")");
            wildAnimal.makeSound();
            wildAnimal.move();
            wildAnimal.eat();
            wildAnimal.hunted();
            System.out.println();
        }
        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
    }
}