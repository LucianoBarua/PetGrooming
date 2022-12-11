package domain;

public class Owner {

    private String idOwner;
    private String name;
    private String phoneNumber;

    public Owner() {
    }

    public Owner(String idOwner, String name, String phoneNumber) {
        this.idOwner = idOwner;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
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