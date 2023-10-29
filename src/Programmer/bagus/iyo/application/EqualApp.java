package Programmer.bagus.iyo.application;

public class EqualApp {
    public static void main(String[] args) {

        String first = "bagus";
        first = first +" " + "iyo";

        System.out.println(first);

        String second = "bagus iyo";
        System.out.println(second);

        System.out.println(first == first);

        String third = "bagus iyo";

        System.out.println(second == third);
    }
}
