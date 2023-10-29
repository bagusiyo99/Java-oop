package Programmer.bagus.iyo.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("bus");
    }


    public int getTier() {
        return 8;
    }


    public String getBrand() {
        return "truk";
    }


    public boolean isMaintaince() {
        return false;
    }

    public boolean isBig() {
        return Car.super.isBig();
    }
}
