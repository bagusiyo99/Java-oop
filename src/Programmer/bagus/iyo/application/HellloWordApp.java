package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.HellloWord;

public class HellloWordApp {
    public static void main(String[] args) {
        HellloWord english = new HellloWord() {
            public void sayHello() {
                System.out.println("hello");
            }


            public void sayHello(String name) {
                System.out.println("hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("babab");
    }
}
