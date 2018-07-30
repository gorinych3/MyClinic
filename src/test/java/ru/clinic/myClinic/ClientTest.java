package ru.clinic.myClinic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void equals() {
        reflexive();
        simetric();
        transitive();
        consistent();
    }

    public void reflexive(){
        Client cl1 = new Client(3,"Pirogov",new Dog("Barbos"));
        assertEquals(cl1,cl1);
    }

    public void simetric(){
        Client cl1 = new Client(3,"Pirogov",new Dog("Barbos"));
        Client cl2 = new Client(3,"Pirogov",new Dog("Barbos"));
        assertEquals(cl1,cl2);
    }

    public void transitive(){
        Client cl1 = new Client(3,"Pirogov",new Dog("Barbos"));
        Client cl2 = new Client(3,"Pirogov",new Dog("Barbos"));
        Client cl3 = new Client(3,"Pirogov",new Dog("Barbos"));
        assertEquals(cl1,cl2);
        assertEquals(cl1,cl3);
        assertEquals(cl2,cl3);
    }

    public void consistent() {
        Client cl1 = new Client(3, "Pirogov", new Dog("Barbos"));
        Client cl2 = new Client(3, "Pirogov", new Dog("Barbos"));
        for (int i = 0; i < 10; i++) {
            assertEquals(cl1, cl2);
        }
    }
}