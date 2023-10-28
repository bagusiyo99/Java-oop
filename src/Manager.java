 class Manager  extends  Employee {

    String company;
     Manager (String name) {
        super(name);
     }

    // jika ada contraktor maka harus ada contraktor di vice
    Manager (String name, String company) {
        super(name);
        this.company = company;
    }


     void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is " + this.name);
    }
}


