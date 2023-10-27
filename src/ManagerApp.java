public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "bagus";
        manager.sayHello("ityo");

        var vp = new VicePresident();
        vp.name = "joko";
        vp.sayHello("jiki");
    }
}
