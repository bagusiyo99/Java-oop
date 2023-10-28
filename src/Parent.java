 class Parent {
    String name;
    void  doIt () {
        System.out.println("DO it in Parent");
    }
}

class Child extends Parent {
    String name;
    void  doIt () {
        System.out.println("DO it in child");
    }
}