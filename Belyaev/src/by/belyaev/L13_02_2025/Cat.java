package by.belyaev.L13_02_2025;

public class Cat extends Pet {

    public Cat(String name, String species, int age, String nameOwner) {
        super(name, species, age, nameOwner);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит Мяу!");
    }

    @Override
    public void move() {
        System.out.println(name + " грациозно крадется");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с хозяином " + nameOwner);
    }
}
