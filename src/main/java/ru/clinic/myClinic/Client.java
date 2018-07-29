package ru.clinic.myClinic;

public class Client {
    private String name;
    private Pet pet;
    private int id;

    public Client(int id, String name, Pet pet) {
        this.name = name;
        this.pet = pet;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                ", id=" + id +
                '}';
    }
}
