package by.belyaev.L13_02_2025owner;

public abstract class Pet extends Animal {

    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public abstract void play();

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}