package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOwner;
    private String name;
    private String phoneNumber;

    public Owner() {
    }

    public Owner(int idOwner, String name, String phoneNumber) {
        this.idOwner = idOwner;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
