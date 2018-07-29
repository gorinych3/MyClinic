package ru.clinic.myClinic;

public class Cat implements Pet {

    private String name;

    public Cat(String name) {
        this.name = name;
    }



    @Override
    public void makesound() {

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
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
