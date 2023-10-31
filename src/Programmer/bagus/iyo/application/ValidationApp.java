package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.annotion.Fancy;
import Programmer.bagus.iyo.data.LoginRequest;
import Programmer.bagus.iyo.error.ValidationException;
import Programmer.bagus.iyo.util.ValadationUtil;

public class ValidationApp {
    @Fancy(name = "AnimalApp", tags =  {"application", "java"})

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "ps");

        //penangan eror
//        try {
//            ValadationUtil.validate(loginRequest);
//            System.out.println("Data Valid");
//        }catch (ValidationException exception) {
//            System.out.println("Terjadi eror : " + exception.getMessage());
//        }

        // multiple eror
        try {
            ValadationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (ValidationException exception) {
            System.out.println("Terjadi eror : " + exception.getMessage());
        }catch (NullPointerException exception) {
            System.out.println("Terjadi eror : " + exception.getMessage());
        }

        //runtime
        LoginRequest loginRequest2 = new LoginRequest("", "ps");
        ValadationUtil.validateRuntime(loginRequest2);



    }

}
