package by.belyaev.L23_01_2025;

public class Bilding {
    String street;
    String material;
    int dor;
    int windows;

    public Bilding(String street, String material, int dor, int windows) {
        this.street = street;
        this.material = material;
        this.dor = dor;
        this.windows = windows;
    }

    public Bilding() {

    }

    String getDescription() {
        return "Здание на улице " + street + " построено из " + material + " и в нем " + dor + " дверей и " + windows + " окон";
    }
}
