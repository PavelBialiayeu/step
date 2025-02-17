package by.belyaev.L13_02_2025;

import java.util.Random;

public abstract class Pet extends Animal {

    private static String [] surNames = new String[5];

    private Random random = new Random();

    static {
        surNames[0] = "Гуща";
        surNames[1] = "Галузо";
        surNames[2] = "Тарасенко";
        surNames[3] = "Борисенко";
        surNames[4] = "Петренко";
    }

    protected String nameOwner;

    protected String ownerSurName;

    public Pet(String name, String species, int age, String nameOwner) {
        super(name, species, age);
        this.nameOwner = nameOwner;
        this.ownerSurName = surNames[random.nextInt(surNames.length)]; //рандомная фамилия\
    }

    public abstract void play();

    public String getNameOwner() {
        return nameOwner;
    }

    public String getOwnerSurName() {
        return ownerSurName;
    }
}