package domain;

import persistence.PersistenceController;

public class Control {

    PersistenceController persistenceController = new PersistenceController();

    public void save(String breed, String color, String comboAllergic, String comboSpecial, String comments, String ownersName, String petsName, String phoneOwner) {
        //Se crea al duenio y se agregan sus valores
        Owner owner = new Owner();
        owner.setName(ownersName);
        owner.setPhoneNumber(phoneOwner);
        //Se crea la mascota y se agregan sus valores
        Pet pet = new Pet();
        pet.setName(petsName);
        pet.setColor(color);
        pet.setBreed(breed);
        pet.setAllergic(comboAllergic);
        pet.setSpecialAttention(comboSpecial);
        pet.setOwner(owner);
        
        persistenceController.save(pet,owner);
    }
}
