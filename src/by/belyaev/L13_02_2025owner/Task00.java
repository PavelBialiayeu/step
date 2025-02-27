package by.belyaev.L13_02_2025owner;

import java.util.ArrayList;
import java.util.List;

public class Task00 {

    public static void main(String[] args) {

        List<Owner> owners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Owner owner = OwnerFactory.next();
            for (int j = 0; j < 200; j++) {
                Pet pet = PetFactory.next();
                owner.addPet(pet);
            }
            owners.add(owner);
        }

        for (Owner owner : owners) {
            System.out.println(owner);
        }
        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());
    }

}