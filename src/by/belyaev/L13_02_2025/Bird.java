package by.belyaev.L13_02_2025;

public class Bird extends Pet {

    public Bird(String name, String species, int age, String nameOwner) {
        super(name, species, age, nameOwner);
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
        System.out.println(name + " играет с хозяином " + nameOwner);
    }
}
