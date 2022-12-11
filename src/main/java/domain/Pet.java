package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_client;
    private String name;
    private String breed;
    private String color;
    private String allergic;
    private String specialAttention;
    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(int num_client, String name, String breed, String color, String allergic, String specialAttention, Owner owner) {
        this.num_client = num_client;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.allergic = allergic;
        this.specialAttention = specialAttention;
        this.owner = owner;
    }

    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(String specialAttention) {
        this.specialAttention = specialAttention;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    

}
