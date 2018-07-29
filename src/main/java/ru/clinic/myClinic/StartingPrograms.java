package ru.clinic.myClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartingPrograms {
    public static void main(String[] args) throws UserUncorrectedExeption, IOException {

        UserInput ui = new UserInput();
        ui.startingInput();
        //ui.closeProgram();

    }

}
