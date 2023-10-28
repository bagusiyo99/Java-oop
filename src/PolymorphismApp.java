public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("bagus");
        employee.sayHello("iyo");

        employee = new Manager("bagus");
        employee.sayHello("iyo");

        employee = new VicePresident("bagus");
        employee.sayHello("iyo");

        sayHello(new Employee("bagus"));
        sayHello(new Manager("ityo"));
        sayHello(new VicePresident("dwi"));

    }

    static void sayHello (Employee employee) {
        if (employee instanceof  VicePresident ){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }

}
