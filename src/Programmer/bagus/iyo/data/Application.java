package Programmer.bagus.iyo.data;

public class Application {

    public static final int PROCESSORS;
    static  {
        System.out.println("akses");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
