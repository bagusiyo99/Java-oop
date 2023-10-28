 class VicePresident extends  Manager {


    VicePresident (String name) {
        super(name , null);
    }

     void sayHello(String name){
         System.out.println("Hi " + name + ", My Name Is Vice " + this.name);
     }
}
