package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.Avanza;
import Programmer.bagus.iyo.data.Car;
import Programmer.bagus.iyo.data.Produk;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();

    }
}
