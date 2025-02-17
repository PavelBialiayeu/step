package by.belyaev.L10_02_2025.zoo;

public class Dog extends Pet {

    public Dog(String name, String species, int age, String nameOwner) {
        super(name, species, age, nameOwner);
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
        System.out.println(name + " играет с хозяином " + nameOwner);
    }
}
