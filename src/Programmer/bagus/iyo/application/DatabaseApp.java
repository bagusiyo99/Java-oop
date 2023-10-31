package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("eko" , "eko");
        System.out.println("sukses");
    }

    public static  void connectDatabase (String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("tidak ada koneksi");
        }
    }
}
