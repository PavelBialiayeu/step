package by.belyaev.L10_02_2025.zoo;

public class Lion extends WildAnimal {


    public Lion(String name, String species, int age, String home) {
        super(name, species, age, home);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит РРРРР!");
    }

    @Override
    public void move() {
        System.out.println(name + " быстро бежит по саванне");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо");
    }

    @Override
    public void hunted() {
        System.out.println(name + " охотится в " + home);
    }
}