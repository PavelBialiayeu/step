package by.belyaev.L13_02_2025owner;

public class Bird extends Pet {

    private static String species = "Птица";

    public Bird(String name, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(name + " летает в небе");
    }

    @Override
    public void eat() {
        System.out.println(name + " клюет зерна");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с хозяином " + super.getOwner());
    }

}