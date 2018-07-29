package ru.clinic.myClinic;

public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }



    @Override
    public void makesound() {
        System.out.println("Gav-gav");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
