package persistence;

import domain.Owner;
import domain.Pet;

public class PersistenceController {
    OwnerJpaController ownerJPA = new OwnerJpaController();
    PetJpaController petJPA = new PetJpaController();

    public void save(Pet pet, Owner owner) {
        //Se crea en el database duenio y mascota
        ownerJPA.create(owner);
        petJPA.create(pet);
    }
}
