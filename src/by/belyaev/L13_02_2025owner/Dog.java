package by.belyaev.L13_02_2025owner;

public class Dog extends Pet {

    private static String species = "Собака";

    public Dog(String name, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(name + " бегает на четырех лапах");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест собачий корм");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с хозяином " + super.getOwner());
    }
}