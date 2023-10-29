package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.Categori;

public class CategoriApp {
    public static void main(String[] args) {

        var category = new Categori();
//        System.out.println(category.getId());
//        System.out.println(category.isExpensive());

        category.setId(null);
        category.setId("ID");

        System.out.println(category.getId());
    }
}
