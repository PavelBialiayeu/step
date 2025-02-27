package by.belyaev.L13_02_2025;

public abstract class WildAnimal extends Animal {

    protected String home;

    public WildAnimal(String name, String species, int age, String home) {
        super(name, species, age);
        this.home = home;
    }

    public abstract void hunted();

    public String getHome() {
        return home;
    }
}