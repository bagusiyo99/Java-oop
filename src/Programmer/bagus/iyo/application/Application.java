package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.Produk;

public class Application {
    public static void main(String[] args) {

        Produk produk = new Produk( "laptop", 223232);
        System.out.println(produk.name);
        System.out.println(produk.price);

    }
}
