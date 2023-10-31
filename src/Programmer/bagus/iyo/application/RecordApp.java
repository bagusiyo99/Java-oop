package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {


            LoginRequest loginRequest = new LoginRequest("bagus", "1234");

            System.out.println(loginRequest.username());
            System.out.println(loginRequest.password());
            System.out.println(loginRequest);

    }
}
