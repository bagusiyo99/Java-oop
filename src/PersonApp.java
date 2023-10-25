public class PersonApp {
    public static void main(String[] args) {



        var person1 = new Person();
        person1.name = "joko";
        person1.address = "balam";


        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHello("bagus");


        Person person2 = new Person();

        Person person3;
        person3 = new Person();
        person3.name = "joko";
        person3.sayHello("bagus");

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);



    }

}
