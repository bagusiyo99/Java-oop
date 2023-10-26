public class PersonApp {
    public static void main(String[] args) {




        var person1 = new Person("joko" , "balam");


        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHello("bagus");



        Person person2 = new Person("joko" );
        person2 = new Person();
        person2.name = "joko";
        person2.sayHello("bagus");

        Person person3;
        person3 = new Person();
        person3.name = "joko";
        person3.sayHello("bagus");





    }

}




