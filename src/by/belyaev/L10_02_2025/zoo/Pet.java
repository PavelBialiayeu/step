package by.belyaev.L10_02_2025.zoo;

public abstract class Pet extends Animal {
    protected String nameOwner;

    public Pet(String name, String species, int age, String nameOwner) {
        super(name, species, age);
        this.nameOwner = nameOwner;

    }

    public abstract void play();

    public String getNameOwner() {
        return nameOwner;
    }
}