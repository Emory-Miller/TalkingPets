package io.zipcoder.polymorphism;

import java.util.ArrayList;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainApplication {
    static Console console = new Console(in, out);

    ArrayList<Pet> petsOwnedList = new ArrayList<>();

    static ArrayList<String> stringList = new ArrayList<>();

    public static void main(String[] args) {

        int numPets = console.getIntInput("How many pets do you have?");

        for (int i = 0; i < numPets; i++) {
            String type = console.getStringInput("What kind of pet is it?");
            String name = console.getStringInput("Whats the name of your pet?");
            petFromInput(type, name);

        }

        console.println(stringList.toString());

//        for (Pet pet : petsOwnedList){
//            console.println(pet.speak());
//        }
    }

    public static Pet petFromInput(String type, String name) {
        if (type.equalsIgnoreCase("dog")) {
            new Dog(name);
        } else if (type.equalsIgnoreCase("cat")) {
            new Cat(name);
        } else if (type.equalsIgnoreCase("bird")) {
            new Bird(name);
        } return new Pet(name);
    }
}
