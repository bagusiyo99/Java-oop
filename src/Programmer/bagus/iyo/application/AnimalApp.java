package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.annotion.Fancy;
import Programmer.bagus.iyo.data.Animal;
import Programmer.bagus.iyo.data.Cat;

@Fancy(name = "AnimalApp", tags =  {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Pas";
        animal.run();

    }
}
